package com.fs.middle.basket.controller;

import com.fs.middle.basket.model.CheckoutInfo;
import com.fs.middle.basket.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @PostMapping("/checkout")
    public ResponseEntity<Order> checkOut(@RequestBody CheckoutInfo checkoutInfo) {
        //reveive checkout request from Jamstack,
        // call payment gateway and payment gateway will process payment based on the payment type in payment object
        // then call SAP api to create order, then return the order info to Jamstack with status
        return ResponseEntity.ok(new Order());
    }
}
