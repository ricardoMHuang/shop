package com.example.demo.dao;

import com.example.demo.entity.ShopType;
import com.example.demo.entity.ShopTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTypeMapper {
    long countByExample(ShopTypeExample example);

    int deleteByExample(ShopTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopType row);

    int insertSelective(ShopType row);

    List<ShopType> selectByExample(ShopTypeExample example);

    ShopType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ShopType row, @Param("example") ShopTypeExample example);

    int updateByExample(@Param("row") ShopType row, @Param("example") ShopTypeExample example);

    int updateByPrimaryKeySelective(ShopType row);

    int updateByPrimaryKey(ShopType row);
}