package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
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
        return "Hallo Welt:"+ id;
    }

    @PostMapping("/hallo/post")
    public String halloPost(String id,String name){
        return "Hallo Welt! Post \nId: "+ id+ "\nName: "+name;
    }


}
