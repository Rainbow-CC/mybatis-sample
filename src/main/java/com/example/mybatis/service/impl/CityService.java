package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.CityMapper;
import com.example.mybatis.model.City;
import com.example.mybatis.service.ICityService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    CityMapper cityMapper;

    @Override
    public PageInfo<City> getCityByPage(int pageNum, int pageSize) {
        PageHelper.startPage(1, 10);
        List<City> cities = cityMapper.selectAll();
        return new PageInfo<>(cities);
    }
}
