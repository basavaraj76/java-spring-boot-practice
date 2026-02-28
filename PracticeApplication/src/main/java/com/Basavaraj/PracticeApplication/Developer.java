package com.Basavaraj.PracticeApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Developer {
    @RequestMapping("/")
    public String buildingApp(){
        return "Compiling, coding, testing ";
    }

}
