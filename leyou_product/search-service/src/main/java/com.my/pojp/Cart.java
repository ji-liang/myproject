package com.my.pojp;

import lombok.Data;

@Data
public class Cart {
    private Long skuId;
    private String title;
    private String images;
    private Integer num;
    private Long price; //分

    public Cart() {
    }

    public Cart(Long skuId, Integer num) {
        this.skuId = skuId;
        this.num = num;
    }

    public Cart(Long skuId, String title, String images, Integer num, Long price) {
        this.skuId = skuId;
        this.title = title;
        this.images = images;
        this.num = num;
        this.price = price;
    }

}
