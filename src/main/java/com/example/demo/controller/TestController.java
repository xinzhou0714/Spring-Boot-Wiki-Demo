package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * GET, POST,PUT, DELETE
     */
    @RequestMapping("/hallo")
    public String hallo(@RequestParam String id){
        return "Hallo Welt:"+ id;
    }

}
