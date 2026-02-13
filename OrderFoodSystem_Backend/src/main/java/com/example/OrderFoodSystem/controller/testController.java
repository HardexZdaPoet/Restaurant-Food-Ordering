package com.example.OrderFoodSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class testController {
    @RestController
    public class HealthController {

        @GetMapping("/")
        public String health() {
            return "Backend is running 🚀";
        }

    }

}