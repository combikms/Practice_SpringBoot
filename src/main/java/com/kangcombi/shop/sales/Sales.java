package com.kangcombi.shop.sales;

import com.kangcombi.shop.Member.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@ToString
public class Sales {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String itemName;
    public Integer price;
    public Integer count;
    @ManyToOne
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    public Member member;
    @CreationTimestamp
    public LocalDateTime created;
}
