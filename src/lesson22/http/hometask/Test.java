package lesson22.http.hometask;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI uri = URI.create("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=418969814078357800fcf2d3df514a26&with_original_language=en");

        HttpRequest request = HttpRequest.newBuilder()
//                .header("","")
                .GET()
                .uri(uri)
                .build();

        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        HttpResponse<String> response = client.send(request, handler);

        System.out.println("Response code: " + response.statusCode());
        System.out.println("Response body: " + response.body());

        //https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=418969814078357800fcf2d3df514a26&with_original_language=en
        //Вывести самый старый фильм

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        JsonArray films = JsonParser.parseString(response.body()).getAsJsonObject().get("results").getAsJsonArray();
        LocalDate oldestDate = LocalDate.now();
        String oldestFilmName = "";
        for(JsonElement film : films) {
            String filmName = film.getAsJsonObject().get("original_title").getAsString();
            String releaseDate = film.getAsJsonObject().get("release_date").getAsString();
            LocalDate formattedReleaseDate = LocalDate.parse(releaseDate,formatter);

            if(formattedReleaseDate.isBefore(oldestDate)) {
                oldestFilmName = filmName;
                oldestDate = formattedReleaseDate;
            }
        }

        System.out.println("The oldest film: " + oldestFilmName);
        System.out.println("Was released on: " + oldestDate);
    }
}
