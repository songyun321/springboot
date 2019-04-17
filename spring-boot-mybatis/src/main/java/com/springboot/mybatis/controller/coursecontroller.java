package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.service.CourseService;
import jdk.vm.ci.meta.Value;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
@requestMapping(Value= "/api")
public class coursecontroller {
    @Resource
    private CourseService courseService;

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> selectAll() {

    }
}
