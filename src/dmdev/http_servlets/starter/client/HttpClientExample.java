package dmdev.http_servlets.starter.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;

import static java.net.http.HttpResponse.BodyHandlers;

public class HttpClientExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        var httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        var getRequest = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .GET()
                .build();

        var postRequest = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .POST(BodyPublishers.ofString("POSTPOSTPOST"))
                .build();

        var response = httpClient.send(getRequest, BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.headers());
    }
}
