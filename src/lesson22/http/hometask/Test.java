package lesson22.http.hometask;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException, InterruptedException {

        Film film = parseToFilm("The%20Great%20Gatsby");
        System.out.println(film);
    }

    public static void findOldestFilm(String link) throws IOException, InterruptedException {
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

    public static Film parseToFilm(String filmName) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI filmsByName = URI.create("https://api.themoviedb.org/3/search/movie?&api_key=418969814078357800fcf2d3df514a26&query="+filmName);

        HttpRequest filmsByNameRequest = HttpRequest.newBuilder()
//                .header("","")
                .GET()
                .uri(filmsByName)
                .build();

        HttpResponse.BodyHandler<String> handler1 = HttpResponse.BodyHandlers.ofString();

        HttpResponse<String> filmsByNameResponse = client.send(filmsByNameRequest, handler1);

        System.out.println("Response code: " + filmsByNameResponse.statusCode());
        System.out.println("Response body: " + filmsByNameResponse.body());

        int id = JsonParser.parseString(filmsByNameResponse.body()).getAsJsonObject()
                .get("results").getAsJsonArray().get(0).getAsJsonObject().get("id").getAsInt();
        URI filmById = URI.create("https://api.themoviedb.org/3/movie/"+id+"?api_key=418969814078357800fcf2d3df514a26");

        HttpRequest filmsByIdRequest = HttpRequest.newBuilder()
//                .header("","")
                .GET()
                .uri(filmById)
                .build();

        HttpResponse.BodyHandler<String> handler2 = HttpResponse.BodyHandlers.ofString();

        HttpResponse<String> filmsByIdResponse = client.send(filmsByIdRequest, handler2);

        System.out.println("Response code: " + filmsByIdResponse.statusCode());
        System.out.println("Response body: " + filmsByIdResponse.body());

        JsonObject film = JsonParser.parseString(filmsByIdResponse.body()).getAsJsonObject();

        Film f = new Film();

        String title = film.get("original_title").getAsString();
        double budget = film.get("budget").getAsDouble();
        List<String> genres = getGenres(film.get("genres"));
        int duration = film.get("runtime").getAsInt();

        f.setTitle(title);
        f.setBudget(budget);
        f.setGenreList(genres);
        f.setDuration(duration);

        return f;
    }

    public static List<String> getGenres(JsonElement genresJson) {
        List<String> genres = new ArrayList<>();
        for(JsonElement genre : genresJson.getAsJsonArray()) {
            String genreName = genre.getAsJsonObject().get("name").getAsString();
            genres.add(genreName);
        }
        return genres;
    }
}
