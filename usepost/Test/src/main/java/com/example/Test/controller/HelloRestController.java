package com.example.Test.controller;


import org.springframework.web.bind.annotation .*;
import com.example.Test.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {


    // curl localhost:8080/hello -w "\n"
    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name+" from Bridgelabz";
    }

    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name){
        return "Hello " + name+" from Bridgelabz";
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }

}