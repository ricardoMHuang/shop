package com.example.demo.service.impl;

import com.example.demo.mapper.ShopMapper;
import com.example.demo.entity.Shop;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;
    @Override
    /**
     * 添加商店
     * @param shop 商店对象
     */
    public int add(Shop shop) {
        //添加商店逻辑
        //判断商店是否存在
        if(shopMapper.selectById(shop.getId())==null){
            return 0;
        }
        if(shopMapper.insert(shop)==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int update(Shop shop) {
        //更新商店逻辑
        //判断商店是否存在
        if(shopMapper.selectById(shop.getId())==null){
            return 0;
        }
        if(shopMapper.updateById(shop)==1){
            return 1;
        }
        return 0;
    }

}
