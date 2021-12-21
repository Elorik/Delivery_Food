package com.example.foodpurshase;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class model {
    @Id
    String foodName;
    int foodPrice;
}
