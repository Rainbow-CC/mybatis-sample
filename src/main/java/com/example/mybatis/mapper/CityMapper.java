package com.example.mybatis.mapper;

import com.example.mybatis.model.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}