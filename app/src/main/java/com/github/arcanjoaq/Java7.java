package com.github.arcanjoaq;

public class Java7 {
    public static void main(String[] args) {
        // The try-with-resources

        // Catching Multiple Exceptions by single catch

        // String in switch statement (Java 7)
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
}
