package com.github.arcanjoaq;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9 {

    public static void main(String[] args) {
        // Collection factory methods
        final Set<Integer> ints = Set.of(1, 2, 3);
        final List<String> strings = List.of("first", "second", "third");
        final Map<String, ? extends Serializable> map = Map.of("id", 1, "name", "foo");
        System.out.println(ints);
        System.out.println(strings);
        System.out.println(map);

        // JShell
    }

    interface K8sClient extends Serializable {

        default void lint(final File file) {
            final String yaml = readYaml(file);
            System.out.println("lint: " + yaml);
        }

        // private method
        private String readYaml(final File file) {
            return "My yaml";
        }
    }
}
