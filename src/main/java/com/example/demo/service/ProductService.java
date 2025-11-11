package com.example.demo.service;

import com.example.demo.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final RestTemplate restTemplate;

    public ResponseEntity<Product> getProductByHscode(String hscode) {
        String url = "http://172.19.130.11:8080/products/" + hscode;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON, MediaType.ALL));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<Product> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,
                        entity,
                        new ParameterizedTypeReference<Product>() {}
                );

        return ResponseEntity.ok(response.getBody());
    }
}