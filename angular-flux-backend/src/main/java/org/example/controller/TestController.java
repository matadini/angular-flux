package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@RestController
class TestController {
    @GetMapping("/data")
    public Flux<String> get() {
        return Flux.fromStream(Stream.of("Janek", "Franek", "Maciek", "Gacek"))
                .delayElements(Duration.ofMillis(500));
    }
}
