package com.kangcombi.shop.Member;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String username;
    public String password;
    public String displayName;
}