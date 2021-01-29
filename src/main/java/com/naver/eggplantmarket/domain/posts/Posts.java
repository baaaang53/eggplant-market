package com.naver.eggplantmarket.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String product;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column
    private String seller;

    @Column
    private int price;

    @Builder
    public Posts(String product, String description, String seller, int price) {
        this.product = product;
        this.description = description;
        this.seller = seller;
        this.price = price;
    }
}
