package examples.greeter;

import greeter.provider.Friendly;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendlyTest {
    @Test
    public void testGreeting() {
        String greeting = new Friendly().hello();
        assertTrue(greeting.contains("welcome"));
    }

}