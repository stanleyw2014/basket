package com.fs.middle.basket.controller;

import com.fs.middle.basket.model.Basket;
import com.fs.middle.basket.model.BasketItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class BasketController {

    @PostMapping("/basket")
    public ResponseEntity<Basket> createBasket() {
        return ResponseEntity.ok(new Basket());
    }
    @PutMapping("/basket/{basketId}/items")
    public ResponseEntity<Basket> addItem(@PathVariable String basketId, @RequestBody BasketItem item) {
        //retrieve item info from SAP API
        return ResponseEntity.ok(new Basket());
    }

    @GetMapping("/basket/{basketId}")
    public ResponseEntity<Basket> retrieveBasket(@PathVariable String basketId) {
        return ResponseEntity.ok(new Basket());
    }
    @PutMapping("/basket/{basketId}/items/{itemId}")
    public ResponseEntity<Basket> updateItemQuantity(@PathVariable String basketId, @PathVariable String itemId) {
        return ResponseEntity.ok(new Basket());
    }
    @DeleteMapping("/basket/{basketId}/items/{itemId}")
    public ResponseEntity<Basket> removeItem(@PathVariable String itemId) {
        return ResponseEntity.ok(new Basket());
    }
    @DeleteMapping("/basket/{basketId}")
    public ResponseEntity clearBasket(@PathVariable String basketId) {
        return (ResponseEntity) ResponseEntity.ok();
    }
}
