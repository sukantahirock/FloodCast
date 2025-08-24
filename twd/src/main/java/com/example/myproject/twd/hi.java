package com.example.myproject.twd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class hi {
    @GetMapping("/hi")
    public String sayHello() {
        return "Hi world";
    }
    
    
}
