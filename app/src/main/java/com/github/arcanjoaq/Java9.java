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

        // Remote debug

        // Java 1-3: -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005

        // Java 4: -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005

        // Java 5-8: -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005

        // Java 9+: -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=127.0.0.1:8000

        // Cacerts location

        // Java 1-8: ${JDK_HOME}/jre/lib/security/cacerts

        // Java 9+: ${JDK_HOME}/lib/security/cacerts
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
