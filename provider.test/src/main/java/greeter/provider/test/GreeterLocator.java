package greeter.provider.test;

import greeter.api.Greeter;

import java.util.ServiceLoader;

public class GreeterLocator {
    public Greeter findGreeter() {
        return ServiceLoader.load(Greeter.class).findFirst().orElseThrow(() -> new RuntimeException("No Greeter found"));
    }
}
