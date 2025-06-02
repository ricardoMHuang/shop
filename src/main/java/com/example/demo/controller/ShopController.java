package com.example.demo.controller;

import com.example.demo.entity.Shop;
import com.example.demo.service.ShopService;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;

    @PostMapping("/add")
    /**
     * 添加
     * @param shop 商店对象
     */
    public Result add(@RequestBody Shop shop) {
        // Logic to handle user login
        if (shopService.add(shop) == 0) {
            return Result.error("添加失败");
        }
        return Result.success("添加成功");
    }

    @PostMapping("/update")
    /**
     * 更新
     * @param shop 商店对象
     */
    public Result update(@RequestBody Shop shop) {
        // Logic to handle user login
        if (shopService.update(shop) == 0) {
            return Result.error("更新失败");
        }
        return Result.success("更新成功");
    }
}
