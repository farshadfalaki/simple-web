package com.farshad.simpeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpeWebApplication.class, args);
    }

    @GetMapping(value = "/simpe/hi")
    public String sayHi(){
        return "Hallo! CI/CD Jaa";
    }

}
