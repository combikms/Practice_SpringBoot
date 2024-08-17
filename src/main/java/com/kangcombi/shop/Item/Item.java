package com.kangcombi.shop.Item;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
@Table(indexes = @Index(columnList = "title", name = "titleIndex"))
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public Integer price;
}