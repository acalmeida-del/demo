package com.example.demo;

import com.example.demo.dto.Product;
import com.example.demo.service.NebrasService;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getProductsByHsCode")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping("/{hscode}")
    public ResponseEntity<Product> getProduct(@PathVariable String hscode) {
        return productService.getProductByHscode(hscode);
    }
}
