package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestGreeter {
    @Test
     protected void createGreeting(){
     //Given
        Greeter a = new Greeter();
        String expectedValue = "Hello Chris, nice to meet you!";

        String realValue = a.greet("Vincent");
        assertEquals(expectedValue, realValue);


    }
}
