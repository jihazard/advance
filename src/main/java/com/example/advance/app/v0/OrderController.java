package com.example.advance.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderV0 orderV0;

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderV0.orderItem(itemId);
        return "ok";
    }

}
