package com.ylchen.vvlog.mapper;

import com.ylchen.vvlog.pojo.UserReport;

public interface UserReportMapper {
    int deleteByPrimaryKey(String iduserReport);

    int insert(UserReport record);

    int insertSelective(UserReport record);

    UserReport selectByPrimaryKey(String iduserReport);

    int updateByPrimaryKeySelective(UserReport record);

    int updateByPrimaryKey(UserReport record);
}