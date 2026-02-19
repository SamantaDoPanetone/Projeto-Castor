package br.com.restaurante.castor.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class AppHomeController {
    @Controller
    @RequestMapping("/app")
    public class ApphomeController {

        @GetMapping
        public String home() {

            return "app/home";
        }
    }
}
