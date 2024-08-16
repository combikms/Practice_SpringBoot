package com.kangcombi.shop.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void saveMember(String username, String password, String displayName) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Member member = new Member();
        member.username = username;
        member.password = encoder.encode(password);
        member.displayName = displayName;
        memberRepository.save(member);
    }

}