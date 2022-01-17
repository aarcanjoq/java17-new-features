package com.github.arcanjoaq;

public class Java16 {
    // Records

    record Point(int x, int y) { }

    record LatLng (double lat, double lng) {
        void print() {
            System.out.printf("Lat: %f, Lng: %f%n", lat, lng);
        }
    }

    public static void main(String[] args) {
        // Records
        final Point p = new Point(10, 2);
        System.out.println(p.x());
        System.out.println(p.y());

        final LatLng sp = new LatLng(-23.533773, -46.625290);
        sp.print();

        final LatLng liverpool = new LatLng(53.400002, -2.983333);
        liverpool.print();

        // Pattern matching for instanceof
        print("Foo");
        printVersion("java16");
    }



    static void print(Object obj) {
        // Pattern matching for instanceof
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

    static void printVersion(Object o) {
        if (o instanceof String s && s.length() > 5) {
            System.out.println(s.toUpperCase());
        }
    }
}
