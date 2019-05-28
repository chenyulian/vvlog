package com.ylchen.vvlog.mapper;

import com.ylchen.vvlog.pojo.Bgm;

public interface BgmMapper {
    int deleteByPrimaryKey(String idbgm);

    int insert(Bgm record);

    int insertSelective(Bgm record);

    Bgm selectByPrimaryKey(String idbgm);

    int updateByPrimaryKeySelective(Bgm record);

    int updateByPrimaryKey(Bgm record);
}