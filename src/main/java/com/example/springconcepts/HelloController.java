package com.example.springconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;


@RestController  // Marks this class as a Controller
@RequestMapping("/api")  // Base URL path for endpoints
class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }
}




@RestController  // Marks this class as a REST Controller
@RequestMapping("/hello")  // Base URL path for endpoints
class HelloControllerMark {

    // Query Parameter API: localhost:8080/hello/query?name=Mark
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}

@RestController  // Marks this class as a REST Controller
@RequestMapping("/hello")  // Base URL path for endpoints
class HelloController_PathVariable {

    // Path Variable API: localhost:8080/hello/param/Mark
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}



@RestController
@RequestMapping("/hello")
class HelloControllerFirstLastName {

    // POST API: localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}