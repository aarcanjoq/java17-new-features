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
        // Unicode 10

        // https://www.fileformat.info/info/unicode/char/1f92a/index.htm

        System.out.println("\u26A0 Error on deploy app");

        System.out.println("\uD83E\uDD2A Deploy executed successfully");

        System.out.println("\uD83D\uDC7B of Tsushima");

        // HTTP Client (Standard)
        executeHttpRequest();

        // Transport Layer Security (TLS) 1.3
        // https://mkyong.com/java/what-is-new-in-java-11/#:~:text=JVMTM%20Tool%20Interface-,14.%20JEP%20332%3A%20Transport%20Layer%20Security%20(TLS)%201.3,-Java%2011%20supports

        // Launch Single-File Source-Code Programs
        // https://mkyong.com/java/what-is-new-in-java-11/#:~:text=Poly1305%20encryption%20examples-,12.%20JEP%20330%3A%20Launch%20Single%2DFile%20Source%2DCode%20Programs,-This%20Single%2DFile

        // #!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11

        // Flight Recorder
        // https://mkyong.com/java/what-is-new-in-java-11/#:~:text=Unicode%20in%20Java-,10.%20JEP%20328%3A%20Flight%20Recorder,-Java%20Flight%20Recorder
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
