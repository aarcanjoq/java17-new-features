package com.github.arcanjoaq;

public class Java14 {

    public static void main(String[] args) {
        // Switch Expressions
        System.out.println(getNumber(Day.WEDNESDAY));

        // https://www.journaldev.com/37273/java-14-features#:~:text=3.%20Helpful%20NullPointerExceptions
        //new Customer().getAddress().getStreet();
    }

    static int getNumber(final Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.println("Value: 6");
                yield 6;
            }
            case TUESDAY -> {
                System.out.println("Value: 7");
                yield 7;
            }
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> {
                System.out.println("Value: 9");
                yield 9;
            }
            default -> throw new IllegalStateException("Invalid day: " + day);

        };
    }

    static class Customer {
        private String name;
        private Address address;

        public String getName() {
            return this.name;
        }

        public Address getAddress() {
            return this.address;
        }

        static class Address {
            private String street;

            public String getStreet() {
                return this.street;
            }
        }
    }


}
