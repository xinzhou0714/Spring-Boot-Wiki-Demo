package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${test.myproperty:default}")
    private  String testProperty;
    /**
     * GET, POST,PUT, DELETE
     */
    /*
    *可供选择的注解
    *@PostMapping
    *@PutMapping
    *@DeleteMapping
    *@RequestMapping(value = "/user/1",method = RequestMethod.GET)
    *@RequestMapping(value = "/user/1",method = RequestMethod.POST)
     */
    @RequestMapping("/hallo")
    public String hallo(@RequestParam String id){
        return "Hallo Welt:"+ id +"\n und MyProperty ist: "+testProperty;
    }

    @PostMapping("/hallo/post")
    public String halloPost(String id,String name){
        return "Hallo Welt! Post \nId: "+ id+ "\nName: "+name;
    }


}
