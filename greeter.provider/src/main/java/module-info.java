import examples.greeter.api.Greeter;
import examples.greeter.provider.Friendly;

module greeter.provider {
    requires greeter.api;

    provides Greeter with Friendly;
}