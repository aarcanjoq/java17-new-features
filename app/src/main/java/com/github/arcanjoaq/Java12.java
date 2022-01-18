package com.github.arcanjoaq;

public class Java12 {
    public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        System.out.println(getNumber(Day.WEDNESDAY));
    }

    static int getNumber(final Day day) {
        // Switch Expressions (preview)
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };
    }

}
