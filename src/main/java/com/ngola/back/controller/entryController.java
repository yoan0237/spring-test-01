package com.ngola.back.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("home")
public class entryController {

    @GetMapping("/")
    public String getMethodName() {
        return "Hello guys of world";
    }
    

}
