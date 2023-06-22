package com.kwiatkowsky.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping
    @RequestMapping("/product")
    public String testGetter() {
        return "Test Product";
    }
}