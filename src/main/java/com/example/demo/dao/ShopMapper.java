package com.example.demo.dao;

import com.example.demo.entity.Shop;
import com.example.demo.entity.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    long countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shop row);

    int insertSelective(Shop row);

    List<Shop> selectByExampleWithBLOBs(ShopExample example);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Shop row, @Param("example") ShopExample example);

    int updateByExampleWithBLOBs(@Param("row") Shop row, @Param("example") ShopExample example);

    int updateByExample(@Param("row") Shop row, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop row);

    int updateByPrimaryKeyWithBLOBs(Shop row);

    int updateByPrimaryKey(Shop row);
}