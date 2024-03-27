package lesson22.httpserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

    public static final int PORT = 7070;

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT),0);
        server.createContext("/hello", new HelloHandler());
        server.createContext("/multiply", new MultiplyHandler());
        server.createContext("/users", new UserHandler());

        System.out.println("Server started");
        server.start();
    }
}

class UserHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200,0);
        User user = new User("TestUser",25);
        try(OutputStream os = exchange.getResponseBody()) {
            os.write("{ \"name\":%s, \"age\":%d }".formatted(user.getName(),user.getAge()).getBytes());
        }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String param = exchange.getRequestURI().toString().split("\\?")[1];

        String response = "Hello " + param.substring(param.indexOf("=")+1);

        exchange.sendResponseHeaders(200, 0);
        try(OutputStream os = exchange.getResponseBody()) {
//            for(DayOfWeek dayOfWeek : DayOfWeek.values()) {
//                os.write((dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + "\n").getBytes());
//            }
            os.write(response.getBytes());
        }
    }
}

class MultiplyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String[] responseParams = exchange.getRequestURI().toString().split("\\?")[1].split("&");

        exchange.sendResponseHeaders(200,0);
        try(OutputStream os = exchange.getResponseBody()) {
            int result = 1;

            for(String responseParam : responseParams) {
                int paramValue = Integer.parseInt(responseParam
                        .substring(responseParam.indexOf("=") + 1));
                result *= paramValue;
            }

            os.write(("Multiply result= " + result).getBytes());

        }
    }
}
