package com.demo.gateway.circuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.awt.datatransfer.StringSelection;

@RestController
public class FallbackController {
    @GetMapping("/service-fallback")
    public Mono<String> fallBackService(){
        return Mono.just("Por el momento nos encontramos " +
                "con problemas técnicos, por favor intente en unos minutos.");
    }

}
