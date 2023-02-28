package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping
    public String getCustom(){
        return "Hello from custom";
    }

}