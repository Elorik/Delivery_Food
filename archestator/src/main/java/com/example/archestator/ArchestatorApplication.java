package com.example.archestator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ArchestatorApplication {

    public static void main(String[] args) {
        add();
        total();
    }
    public static void add() {
        RestTemplate rt = new RestTemplate();
        model product = new model();
        product.setFoodName("cake");
        product.setFoodPrice(2);
        rt.postForEntity("http://localhost:8000/add",new HttpEntity<model>(product),model.class);

        product.setFoodName("cola");
        product.setFoodPrice(1);
        rt.postForEntity("http://localhost:8000/add",new HttpEntity<model>(product),model.class);

    }
    public static void total() {
        int price = 0;
        RestTemplate rt = new RestTemplate();
        model product = new model();

        product.setFoodName("cake");
        price += rt.postForEntity("http://localhost:8000/get",new HttpEntity<model>(product),int.class).getBody();

        product.setFoodName("cola");
        price += rt.postForEntity("http://localhost:8000/get",new HttpEntity<model>(product),int.class).getBody();

        System.out.println(price);
    }

}