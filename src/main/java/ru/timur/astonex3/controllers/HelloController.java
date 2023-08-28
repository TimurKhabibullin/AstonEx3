package ru.timur.astonex3.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping()
    public ResponseEntity<?> hello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}
