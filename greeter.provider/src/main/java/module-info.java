import greeter.api.Greeter;
import greeter.provider.Friendly;

module greeter.provider {
    requires greeter.api;

    provides Greeter with Friendly;
}