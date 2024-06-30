package com.example.mybatis.controller;


import com.example.mybatis.mapper.CityMapper;
import com.example.mybatis.model.City;
import com.example.mybatis.service.ICityService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {


    @Autowired
    ICityService cityService;


    @GetMapping
    public PageInfo<City> getCityByPage(@RequestParam int pageNum,@RequestParam int pageSize) {
        return cityService.getCityByPage(pageNum, pageSize);
    }


}
