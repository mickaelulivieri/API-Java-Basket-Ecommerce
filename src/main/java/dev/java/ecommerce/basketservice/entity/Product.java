package dev.java.ecommerce.basketservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document
public class Product {

    private Long id;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
