package com.example.FirstService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RefreshScope
@RestController
@RequestMapping("/first-service")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First Service";
    }

    @PostMapping("/test")
    public String test(@RequestBody String body) {
        System.out.println(body);
        return "test";
    }
    @GetMapping("/check")
    public String check() {
        return "First service is check";
    }

    @GetMapping("/select")
    public String select() {
        return "First Service is select";
    }

}
