package com.kirito.demo.controller;

import com.kirito.demo.constant.CookieConstant;
import com.kirito.demo.constant.RedisConstant;
import com.kirito.demo.entity.UserDO;
import com.kirito.demo.service.UserService;
import com.kirito.demo.untils.CookieUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by ccy on 2017/9/21.
 */
@Controller
@lombok.extern.slf4j.Slf4j
public class MyController {
    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/login")
    String index() {
        return "login";
    }

    @RequestMapping("/")
    String hello() {
        return "hello";
    }

    @PostMapping("/dologin")
    @ResponseBody
    public String dologin(@RequestParam String username,
                          @RequestParam String password,
                          HttpServletResponse response) {
        try {
            UserDO user = userService.findUser(username, password);
            log.info("user: " + user.toString());
        } catch (NullPointerException e) {
            return "false";
        }
        String token = UUID.randomUUID().toString();
        Integer exprie = RedisConstant.EXPIRE;

        redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX, token), username, exprie, TimeUnit.SECONDS);
        CookieUntil.set(response, CookieConstant.TOKEN, token, exprie);

        return "ok";
    }
}