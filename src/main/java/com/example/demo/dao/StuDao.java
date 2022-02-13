package com.example.demo.dao;

import com.example.demo.entity.Stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuDao {

    Stu queryStuById(Integer id);
}
