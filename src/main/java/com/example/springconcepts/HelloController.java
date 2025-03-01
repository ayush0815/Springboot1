package com.example.springconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/hello")  // Base URL path for endpoints
public class HelloController {

    // Query Parameter API: localhost:8080/hello/query?name=Mark
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
