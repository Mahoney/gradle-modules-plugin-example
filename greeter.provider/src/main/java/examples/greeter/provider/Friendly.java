package examples.greeter.provider;

import examples.greeter.api.Greeter;

public class Friendly implements Greeter {
    @Override
    public String hello() {
        return "Hello and welcome!";
    }
}
