package com.sports.dao;

import com.sports.entity.PublicSite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicSiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicSite record);

    int insertSelective(PublicSite record);

    PublicSite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PublicSite record);

    int updateByPrimaryKey(PublicSite record);
}