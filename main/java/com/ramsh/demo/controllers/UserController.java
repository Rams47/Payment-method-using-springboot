package com.ramsh.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, JSP!");
        return "hello"; // This should resolve to hello.jsp
    }
}