#!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11

public class NullPointerJava11 {

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

      public static void main(String[] args) {
        new Customer().getAddress().getStreet();
      }
}