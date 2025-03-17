package dev.java.ecommerce.basketservice.service;

import dev.java.ecommerce.basketservice.entity.Basket;
import dev.java.ecommerce.basketservice.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;

    private Basket createBasket(BasketRequest basketRequest){

        Basket basket = Basket.builder().build();

        basket.calculateTotalPrice();

        return basketRepository.save(basket);
    }



}
