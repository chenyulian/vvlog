package com.ylchen.vvlog.mapper;

import com.ylchen.vvlog.pojo.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(String idcomments);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String idcomments);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}