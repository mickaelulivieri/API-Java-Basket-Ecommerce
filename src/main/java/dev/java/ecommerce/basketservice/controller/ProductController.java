package dev.java.ecommerce.basketservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Void> getAllProducts(){

        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Void> getProductById(@PathVariable Long id){

        return ResponseEntity.ok().build();
    }
}
