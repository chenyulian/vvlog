package com.ylchen.vvlog.mapper;

import com.ylchen.vvlog.pojo.UserFans;

public interface UserFansMapper {
    int deleteByPrimaryKey(String iduserFans);

    int insert(UserFans record);

    int insertSelective(UserFans record);

    UserFans selectByPrimaryKey(String iduserFans);

    int updateByPrimaryKeySelective(UserFans record);

    int updateByPrimaryKey(UserFans record);
}