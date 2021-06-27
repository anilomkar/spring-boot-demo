package com.omkar.springdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootPath {
    @GetMapping("/")
    public String rootPath() {
        return "Welcome to Spring Boot!. It is working... :-)";
    }
}
