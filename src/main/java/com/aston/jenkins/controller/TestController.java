package com.aston.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping
    public String getView() {
        return "second-view";
    }
}