package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class FirstController {

    //http://localhost:8081/hello/world
    @RequestMapping("/world")
    public String sayHello(){
        return "Hey World Hello From Bridgelabz !!";
    }
    // http://localhost:8081/hello/query?name=sanket
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hey "+name+" Hope you are good";
    }
    //http://localhost:8081/hello/param/Sanket
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name ){
        return "Hello "+name+". How Are you ?";
    }
}
