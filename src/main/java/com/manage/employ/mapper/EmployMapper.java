package com.manage.employ.mapper;

import com.manage.employ.beans.Employ;
import com.manage.employ.beans.EmployExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployMapper {
    int countByExample(EmployExample example);

    int deleteByExample(EmployExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employ record);

    int insertSelective(Employ record);

    List<Employ> selectByExample(EmployExample example);

    Employ selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employ record, @Param("example") EmployExample example);

    int updateByExample(@Param("record") Employ record, @Param("example") EmployExample example);

    int updateByPrimaryKeySelective(Employ record);

    int updateByPrimaryKey(Employ record);

    List<Employ> selectAll();
}