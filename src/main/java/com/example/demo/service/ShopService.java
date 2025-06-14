package com.example.demo.service;

import com.example.demo.entity.Shop;

import java.util.List;

public interface ShopService {
    /**
     * 添加
     */
    int add(Shop shop);


    int update(Shop shop);

    int delete(Shop shop);

    List<Shop> query(Shop shop);
}
