package com.kangcombi.shop.Member;

import com.kangcombi.shop.Item.ItemRepository;
import com.kangcombi.shop.Item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/register")
    String register() {
        return "register.html";
    }

    @PostMapping("/member")
    String addMember(@RequestParam String username, String password, String displayName) {
        memberService.saveMember(username, password, displayName);
        return "redirect:/list";
    }

}
