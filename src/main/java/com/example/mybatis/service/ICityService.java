package com.example.mybatis.service;

import com.example.mybatis.model.City;
import com.github.pagehelper.PageInfo;

public interface ICityService {

    PageInfo<City> getCityByPage(int pageNum, int pageSize);
}
