package com.kangcombi.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
    @GetMapping("/list")
    String listpage(Model model) {
        model.addAttribute("name", "kang");
        return "list.html";
    }

}
