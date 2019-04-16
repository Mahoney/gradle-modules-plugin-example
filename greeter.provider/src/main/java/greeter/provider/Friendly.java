package greeter.provider;

import greeter.api.Greeter;

public class Friendly implements Greeter {
    @Override
    public String hello() {
        return "Hello and welcome!";
    }
}
