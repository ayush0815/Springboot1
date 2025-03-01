package com.example.springconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/hello")  // Base URL path for endpoints
public class HelloController {

    // Path Variable API: localhost:8080/hello/param/Mark
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
