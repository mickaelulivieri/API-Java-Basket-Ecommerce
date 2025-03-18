package dev.java.ecommerce.basketservice.controller;

import dev.java.ecommerce.basketservice.controller.request.BasketRequest;
import dev.java.ecommerce.basketservice.entity.Basket;
import dev.java.ecommerce.basketservice.repository.BasketRepository;
import dev.java.ecommerce.basketservice.service.BasketService;
import dev.java.ecommerce.basketservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;

    @GetMapping("{id}")
    public ResponseEntity<Basket> getBasketById(@PathVariable String id){
        return ResponseEntity.ok(basketService.getBasketById(id));
    }
}
