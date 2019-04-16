package greeter.provider.test;

import greeter.api.Greeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class GreeterTest {
    @Test
    public void testLocate() {
        Greeter greeter = new GreeterLocator().findGreeter();
        assertFalse(greeter.hello().isBlank());
    }
}
