package lesson22.http.classwork;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI uri = URI.create("https://swapi.dev/api/people/");

        HttpRequest request = HttpRequest.newBuilder()
//                .header("","")
                .GET()
                .uri(uri)
                .build();

        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        HttpResponse<String> response = client.send(request, handler);

        System.out.println("Response code: " + response.statusCode());
        System.out.println("Response body: " + response.body());


        //https://api.openweathermap.org/data/2.5/weather?q=%D0%90%D0%BB%D0%BC%D0%B0%D1%82%D1%8B&units=metric&lang=ru&appid=79d1ca96933b0328e1c7e3e7a26cb347


        // JsonElement - элемент json
        // JsonObject - объект который хранит в себе данные
        // JsonArray - массив объектов

        JsonElement jsonElement = JsonParser.parseString(response.body());
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        String base = jsonObject.get("base").getAsString();
//
//        JsonObject main = jsonObject.get("main").getAsJsonObject();
//        String temp = main.get("temp").getAsString();
//
//        JsonObject wind = jsonObject.get("wind").getAsJsonObject();
//        String speed = wind.get("speed").getAsString();
        //Вывести температуру
        //Скорость ветра
//        System.out.println(base);
//        System.out.println("Temperature: " + temp);
//        System.out.println("Wind speed: " + speed);


        //https://swapi.dev/api/people/
        //Вывести имена всех персонажей

//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        JsonArray characters = jsonObject.get("results").getAsJsonArray();
//        for(JsonElement character : characters) {
//            String characterName = character.getAsJsonObject().get("name").getAsString();
//            System.out.println(characterName);
//        }

        //Вывести имена всех персонажей
        //Количество их фильмов
        //Самый высокий персонаж

        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray characters = jsonObject.get("results").getAsJsonArray();

        String highestCharacter = "";
        int maxHeight = Integer.MIN_VALUE;
        for(JsonElement character : characters) {
            String characterName = character.getAsJsonObject().get("name").getAsString();
            int filmQuantity = character.getAsJsonObject().get("films").getAsJsonArray().size();
            int characterHeight = character.getAsJsonObject().get("height").getAsInt();
            System.out.println("Name: " + characterName);
            System.out.println("Films: " + filmQuantity);

            if(maxHeight < characterHeight) {
                highestCharacter = characterName;
                maxHeight = characterHeight;
            }

            System.out.println();
        }
        System.out.println("Highest character: " + highestCharacter);

        //https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=418969814078357800fcf2d3df514a26&with_original_language=en
        //Вывести самый старый фильм
    }
}
