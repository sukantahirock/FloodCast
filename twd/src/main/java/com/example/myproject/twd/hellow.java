package com.example.myproject.twd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class hellow {
    @GetMapping("/")
    public String sayHello() {
        return "Hellow world";
    }
    
    
}
