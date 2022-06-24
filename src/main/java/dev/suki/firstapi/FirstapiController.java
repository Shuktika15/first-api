package dev.suki.firstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstapiController {
    String str = "Hello";

    @GetMapping("/")
    public String func(@RequestParam(value = "name", defaultValue = "Shuktika") String name) {
        return String.format("%s %s", str, name);
    }
}
