package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.mapper.courseMapper;
import com.springboot.mybatis.service.CourseService;

import javax.annotation.Resources;
import java.util.List;

public class CourseServiceImpl  implements CourseService {
    @Resources
    private courseMapper courseMapper;

    @Override
    public List<Course> selectAll(){
        return courseMapper.sele
    }
}




















