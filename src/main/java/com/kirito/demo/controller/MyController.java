package com.kirito.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/printers")
    @ResponseBody
    String test() {
        String str = "[{\"id\": 1," +
                "\"rid\": \"001\"," +
                "\"printid\": \"0001\"," +
                "\"name\": \"hgd\"," +
                "\"mac\": \"001\"," +
                "\"ipaddr\": \"10.90.102.162\"," +
                "\"descp\": \"火锅店\"," +
                "\"templateid\": \"01\"" +
                "}, {" +
                "\"id\": 2," +
                "\"rid\": \"001\"," +
                "\"printid\": \"0002\"," +
                "\"name\": \"hgd\"," +
                "\"mac\": \"001\"," +
                "\"ipaddr\": \"10.90.102.162\"," +
                "\"descp\": \"火锅店1\"," +
                "\"templateid\": \"01\"" +
                "}]";
        return str;
    }

    @RequestMapping("/printer/templates")
    @ResponseBody
    String test2() {
        String template = "<init>\r\n" +
                "<cnfont=48><usfont=12>{{printerName}}<bl=5>{{foodCategoryName}}<reset>\r\n" +
                "点菜员： {{userName}}\r\n" +
                "点单时间：{{date}}\r\n" +
                "<hr>\r\n" +
                "<cnfont=48><usfont=12>[foods].name<bl=4> [foods].num <bl=3>份 <reset>\r\n" +
                "<cut>";
        String template1 = "123";
        String str = "[{" +
                "\"id\": 1," +
                "\"templateid\": \"01\"," +
                "\"name\": \"hi苹果店\"," +
                "\"content\":" + "\"" + template + "\"" +
                "}]";
        return str;
    }
}