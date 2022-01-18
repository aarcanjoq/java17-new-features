package com.github.arcanjoaq;

import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Objects;

public class Java7 {
    public static void main(String[] args) {

        final String file = Objects.requireNonNull(Java7.class.getClassLoader().getResource("file.txt")).getFile();

        // The try-with-resources
        try (final FileInputStream fileInputStream = new FileInputStream(file)) {
            final byte[] bytes = fileInputStream.readAllBytes();
            final String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Catching Multiple Exceptions by single catch
        try {
            throwsException();
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        // String in switch statement
        final String country = "UK";
        switch (country) {
            case "BR": {
                System.out.println("Brasil");
                break;
            }
            case "EUA": {
                System.out.println("Estados Unidos da América");
                break;
            }
            case "UK": {
                System.out.println("Reino Unido");
                break;
            }
            case "JP": {
                System.out.println("Japão");
                break;
            }
        }
    }

    public static void throwsException() throws SQLException, ParseException, InterruptedException {}
}
