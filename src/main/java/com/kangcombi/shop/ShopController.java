package com.kangcombi.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class ShopController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "This is About Page";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "This is My Page";
    }

    @GetMapping("/date")
    @ResponseBody
    String datepage() {
        return LocalDateTime.now().toString();
    }
}
