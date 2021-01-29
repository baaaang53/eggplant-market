package com.naver.eggplantmarket.web.dto;

import com.naver.eggplantmarket.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String product;
    private String description;
    private String seller;
    private int price;

    @Builder
    public PostsSaveRequestDto(String product, String description, String seller, int price) {
        this.product = product;
        this.description = description;
        this.seller = seller;
        this.price = price;
    }

    public Posts toEntity() { //디비에 엔티티(Posts)형태로 저장해야하니까.
        return Posts.builder()
                .product(product)
                .description(description)
                .seller(seller)
                .price(price)
                .build();
    }
}
