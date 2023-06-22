package com.kwiatkowsky.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping
    @RequestMapping("/customer")
    public String testGetter() {
        return "Test Customer";
    }
}