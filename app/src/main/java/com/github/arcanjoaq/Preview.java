package com.github.arcanjoaq;

public class Preview {

    public static void main(String[] args) {
        // null in switch
        final String s = "";
        final String t = switch (s) {
            //case null -> "";
            case "UF" -> "def";
            default -> "abc";
        };
    }
}
