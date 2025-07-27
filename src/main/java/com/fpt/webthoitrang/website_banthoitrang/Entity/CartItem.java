package com.fpt.webthoitrang.website_banthoitrang.Entity;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItem {
    private UUID id;
    private String name;
    private String image;
    private int quantity;
    private double price;
    private int discount;
}
