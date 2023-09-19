package com.example.JavaHw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    public ModelAndView test() {
        ModelAndView test = new ModelAndView("test/test");
        return test;
    }
}
