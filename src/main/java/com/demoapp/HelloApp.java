package com.demoapp;

public class HelloApp {

    public String greet(String input) {
        String name = (input == null || input.isEmpty()) ? "world"  : input;

        return "Hello, " + name + "!";
    }

}