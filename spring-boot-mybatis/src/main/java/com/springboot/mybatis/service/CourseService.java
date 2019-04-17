package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.mapper.courseMapper;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();



    void delete(long courseId){
        courseMapper.delete();

    }
}
