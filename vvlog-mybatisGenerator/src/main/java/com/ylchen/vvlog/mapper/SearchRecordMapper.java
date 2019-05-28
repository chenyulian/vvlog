package com.ylchen.vvlog.mapper;

import com.ylchen.vvlog.pojo.SearchRecord;

public interface SearchRecordMapper {
    int deleteByPrimaryKey(String idsearchRecords);

    int insert(SearchRecord record);

    int insertSelective(SearchRecord record);

    SearchRecord selectByPrimaryKey(String idsearchRecords);

    int updateByPrimaryKeySelective(SearchRecord record);

    int updateByPrimaryKey(SearchRecord record);
}