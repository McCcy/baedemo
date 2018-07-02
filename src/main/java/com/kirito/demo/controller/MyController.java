package com.kirito.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ccy on 2017/9/21.
 */
@Controller
public class MyController {
    @RequestMapping("/index")
    String index() {
        return "index";
    }

    @RequestMapping("/")
    String hello() {
        return "hello";
    }

    @RequestMapping("/test")
    String test() {
        return "test";
    }
}