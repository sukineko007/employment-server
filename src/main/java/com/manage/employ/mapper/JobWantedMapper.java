package com.manage.employ.mapper;

import com.manage.employ.beans.JobWanted;
import com.manage.employ.beans.JobWantedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobWantedMapper {
    int countByExample(JobWantedExample example);

    int deleteByExample(JobWantedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobWanted record);

    int insertSelective(JobWanted record);

    List<JobWanted> selectByExample(JobWantedExample example);

    JobWanted selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobWanted record, @Param("example") JobWantedExample example);

    int updateByExample(@Param("record") JobWanted record, @Param("example") JobWantedExample example);

    int updateByPrimaryKeySelective(JobWanted record);

    int updateByPrimaryKey(JobWanted record);

    List<JobWanted> selectAll();

    List<JobWanted> selectByStuId(Integer stuId);
}