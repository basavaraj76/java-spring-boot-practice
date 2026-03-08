package com.Basavaraj.PracticeApplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {

    @GetMapping("/")
    public String greeting(){
        return "Hello Basavaraj Welcome to my website";
    }

    @GetMapping("/{name}")
    public String username(@PathVariable String name){
        return "Hey What up " +name;
    }

}
