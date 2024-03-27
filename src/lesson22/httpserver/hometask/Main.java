package lesson22.httpserver.hometask;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(7070),0);
        server.createContext("/products",new ProductHandler());

        server.start();
    }
}

class ProductHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200,0);
        try(OutputStream os = exchange.getResponseBody()) {
            Gson gson = new Gson();
            List<Product> products = new ArrayList<>();
            for(int i = 0; i < 5; i++) {
                Product p = new Product("Product"+(i+1),(i+1)*100);
                products.add(p);
            }
            os.write(gson.toJson(products).getBytes());
        }
    }
}
