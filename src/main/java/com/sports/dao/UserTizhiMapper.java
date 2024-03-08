package com.sports.dao;

import com.sports.entity.UserTizhi;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTizhiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTizhi record);

    int insertSelective(UserTizhi record);

    UserTizhi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTizhi record);

    int updateByPrimaryKey(UserTizhi record);

    UserTizhi selectByPrimaryUserid(int userid);
}