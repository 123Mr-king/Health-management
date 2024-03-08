package com.sports.dao;

import com.sports.entity.Subhealthy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubhealthyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subhealthy record);

    int insertSelective(Subhealthy record);

    Subhealthy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subhealthy record);

    int updateByPrimaryKey(Subhealthy record);

    /**
     * 通过userid查询是否存在该用户亚健康评测
     * @param user_id
     * @return
     */
    Subhealthy selectByUser_id(int user_id);
}