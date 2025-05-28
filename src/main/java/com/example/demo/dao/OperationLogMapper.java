package com.example.demo.dao;

import com.example.demo.entity.OperationLog;
import com.example.demo.entity.OperationLogExample;
import java.util.List;


public interface OperationLogMapper {
    long countByExample(OperationLogExample example);

    int deleteByExample(OperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLog row);

    int insertSelective(OperationLog row);

    List<OperationLog> selectByExampleWithBLOBs(OperationLogExample example);

    List<OperationLog> selectByExample(OperationLogExample example);

    OperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OperationLog row, @Param("example") OperationLogExample example);

    int updateByExampleWithBLOBs(@Param("row") OperationLog row, @Param("example") OperationLogExample example);

    int updateByExample(@Param("row") OperationLog row, @Param("example") OperationLogExample example);

    int updateByPrimaryKeySelective(OperationLog row);

    int updateByPrimaryKeyWithBLOBs(OperationLog row);

    int updateByPrimaryKey(OperationLog row);
}