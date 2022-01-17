package com.github.arcanjoaq;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Java11 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // JEP 327: Unicode 10

        // https://www.fileformat.info/info/unicode/char/1f92a/index.htm

        System.out.println("\u26A0 Error on deploy app");

        System.out.println("\uD83E\uDD2A Deploy executed successfully");

        System.out.println("\uD83D\uDC7B of Tsushima");

        // JEP 321: HTTP Client (Standard)
        executeHttpRequest();

        // JEP 332: Transport Layer Security (TLS) 1.3

        //12. JEP 330: Launch Single-File Source-Code Programs

        // #!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11
    }

    static void executeHttpRequest() throws IOException, InterruptedException {
        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        final HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://httpbin.org/get"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        final HttpResponse<String> response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        final HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
