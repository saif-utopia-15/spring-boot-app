package com.stachlabs.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public Map<String,String> home(){
        return Map.of("status","Server is running" );
    }
}
