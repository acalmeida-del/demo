package com.example.demo;

import com.example.demo.dto.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping("/getProductsByHsCode/{hscode}")
    public ResponseEntity<Product> getProduct(@PathVariable String hscode) {
        return productService.getProductByHscode(hscode);
    }

    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(@RequestBody Product request) {
        return productService.createProduct(request);
    }
}
