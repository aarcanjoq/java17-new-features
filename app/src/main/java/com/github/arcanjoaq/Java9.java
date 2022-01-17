package com.github.arcanjoaq;

import java.io.*;

public class Java9 {

    interface K8sClient extends Serializable {

        // default methods
        default void lint(final File file) {
            final String yaml = readYaml(file);
            System.out.println("lint: " + yaml);
        }

        private String readYaml(final File file) {
            return "My yaml";
        }
    }

    static class AksClient implements K8sClient { }

    public static void main(String[] args) {
        new AksClient().lint(new File("values.yml"));
    }
}
