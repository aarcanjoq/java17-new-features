package com.github.arcanjoaq;

public class Java13 {

    public static void main(String[] args) {
        System.out.println(getNumber(Day.WEDNESDAY));
    }

    static int getNumber(final Day day) {
        // Switch Expressions: yield (preview)
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY: {
                System.out.println("Value: 6");
                yield 6;
            }
            case TUESDAY: {
                System.out.println("Value: 7");
                yield 7;
            }
            case THURSDAY, SATURDAY: {
                System.out.println("Value: 8");
                yield 8;
            }
            case WEDNESDAY: {
                System.out.println("Value: 9");
                yield 9;
            }
            default: {
                throw new IllegalStateException("Invalid day: " + day);
            }
        };
    }


}
