package com.example.foodpurshase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class service {
    final repo r;
    public void product(model n) {
        r.save(n);
    }
    public int getPrice (String foodName){
        return r.findById(foodName).get().getFoodPrice();
    }

}
