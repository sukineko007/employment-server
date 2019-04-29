package com.manage.employ.mapper;

import com.manage.employ.beans.Jianli;
import com.manage.employ.beans.JianliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JianliMapper {
    int countByExample(JianliExample example);

    int deleteByExample(JianliExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jianli record);

    int insertSelective(Jianli record);

    List<Jianli> selectByExample(JianliExample example);

    Jianli selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jianli record, @Param("example") JianliExample example);

    int updateByExample(@Param("record") Jianli record, @Param("example") JianliExample example);

    int updateByPrimaryKeySelective(Jianli record);

    int updateByPrimaryKey(Jianli record);
}