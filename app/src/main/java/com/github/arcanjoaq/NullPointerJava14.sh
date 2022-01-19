#!/home/aarcanjo/.sdkman/candidates/java/17.0.1-zulu/bin/java --source 14

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