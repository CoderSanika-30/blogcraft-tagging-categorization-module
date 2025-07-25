package com.blogcraft.tagging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaggingController_demo {

    @GetMapping("/hello")
    public String sayHello() {
        return "Tagging module is working!";
    }
}
