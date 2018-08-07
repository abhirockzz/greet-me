package com.demoapp;

import org.junit.*;

import static org.junit.Assert.*;

public class HelloAppTest {


    @Test
    public void greetIfNull() {
        HelloApp hello = new HelloApp();
        String greeting = hello.greet(null);
        assertEquals("Hello, world!", greeting);
    }
    
    @Test
    public void greetIfEmpty() {
        HelloApp hello = new HelloApp();
        String greeting = hello.greet("");
        assertEquals("Hello, world!", greeting);
    }
    
    
    @Test
    public void greetIfNameProvided() {
        HelloApp hello = new HelloApp();
        String greeting = hello.greet("kehsihba");
        assertEquals("Hello, kehsihbaa!", greeting);
    }

}