#!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11

import java.util.regex.Pattern;

public class SheBang {
  public static void main(String[] args) {
    final Pattern pattern = Pattern.compile("^(.*)\\.bak\\s*$");
    final String url = (args.length > 0) ? args[0] : "https://localhost:443/abc.bak";
    System.out.printf("URL: '%s', matches: %s%n", url, pattern.matcher(url).matches());
  }
}
