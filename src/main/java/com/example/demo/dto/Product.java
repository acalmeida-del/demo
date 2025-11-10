package com.example.demo.dto;

public class Product {

    private String hscode;

    private String name;

    public Product() {}

    public Product(String hscode, String name) {
        this.hscode = hscode;
        this.name = name;
    }

    public String getHscode() {
        return hscode;
    }

    public String getName() {
        return name;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public void setName(String name) {
        this.name = name;
    }
}
