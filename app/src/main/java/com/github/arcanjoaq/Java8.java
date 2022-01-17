package com.github.arcanjoaq;

import java.io.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Java8 {

    public static void main(String[] args) {
        final List<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(50);
        objects.add(7);
        objects.add(42);

        objects.stream() // stream() is a default method
                .sorted()
                .forEach(integer -> System.out.printf("%d%n", integer)); // Lambda expressions
        // Consumer<T> is a funcional interface

        final Instant instant = new Date().toInstant(); // Java Date and Time API
        final LocalDate localDate = LocalDate.now();
        final LocalTime localTime = LocalTime.now();
        final ZonedDateTime zonedDateTime = localDate.atTime(localTime)
                .atZone(ZoneId.systemDefault());
        System.out.println(instant);
        System.out.println(localDate);
        System.out.println(zonedDateTime);
    }

    interface Config extends Serializable {

        // default methods
        default void save(final File file) {
            try (FileOutputStream f = new FileOutputStream(file);
                 final ObjectOutputStream o = new ObjectOutputStream(f)) {
                o.writeObject(this);
            } catch (final IOException e) {
                throw new RuntimeException(e);
            }
        }

        default Config of(final File file) {
            try (FileInputStream f = new FileInputStream(file);
                 final ObjectInputStream o = new ObjectInputStream(f)) {
                return (Config) o.readObject();
            } catch (final IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
