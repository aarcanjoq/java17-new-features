package com.github.arcanjoaq;

public class Java17 {

    public static void main(String[] args) {
        final Command c = new LoginCommand();
        c.execute();
    }

    // Sealed Classes
    public sealed interface Command permits LoginCommand, LogoutCommand, PluginCommand {
        void execute();
    }

    static final class LoginCommand implements Command {

        @Override
        public void execute() {
            System.out.println("login");
        }
    }

    static final class LogoutCommand implements Command {

        @Override
        public void execute() {
            System.out.println("logout");
        }
    }

    static non-sealed class PluginCommand implements Command {

        @Override
        public void execute() {
            System.out.println("plugin");
        }
    }

    static class MyPluginCommand extends PluginCommand {

        @Override
        public void execute() {
            System.out.println("plugin");
        }
    }

}
