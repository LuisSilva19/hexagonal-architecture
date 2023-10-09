package com.core.product.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Product {
    private UUID cod;
    private String sku;
    private String name;
    private Double value;
    private Double amount;
}
