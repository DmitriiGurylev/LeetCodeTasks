package test.java;

import org.junit.jupiter.api.Test;
import src.MyOptional;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyOptionalTest {
    @Test
    public void testOptional() {
        assertEquals(
                "I'empty",
                new MyOptional() // value = null
                        .map((r) -> "test") // value = null
                        .orElse("I'empty")
        );

        assertEquals(
                "test",
                new MyOptional("value") // value = value
                        .map((r) -> "test") // value = test
                        .orElse("I'empty")
        );
    }
}
