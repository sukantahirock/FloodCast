package com.example.myproject.twd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class meeting {
    @GetMapping("/meet")
    public String sayHello() {
        return "meet Hellow world";
    }
    
    
}
