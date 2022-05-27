package com.example.greetingapp1.controller;


import com.example.greetingapp1.entity.User;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/greeting")
public class GreetingController {


    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloparam(@PathVariable String name) {
        return "Hello" + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getfirstName() + "" + user.getlastName() + "!";
    }

    @PutMapping ("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + "" + lastName + "!";
    }

}