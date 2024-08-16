package com.kangcombi.shop.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveMember(String username, String password, String displayName) {
        Member member = new Member();
        member.username = username;
        member.password = passwordEncoder.encode(password);
        member.displayName = displayName;
        memberRepository.save(member);
    }

}