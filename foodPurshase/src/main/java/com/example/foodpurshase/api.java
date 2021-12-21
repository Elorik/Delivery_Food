package com.example.foodpurshase;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class api {
    final service giveTakeFood;

    @PostMapping("add")
    public void addFood(@RequestBody model info){
        giveTakeFood.product(info);

    }
    @PostMapping("get")
    public int getPrice(@RequestBody model info){
        return giveTakeFood.getPrice(info.foodName);

    }



}



