package io.techplayer.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringSecurityController {

    @GetMapping
    public String helloWorld() {
        return "<h1>Hello World!!!</h1>";
    }
}
