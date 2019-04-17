package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.Course;

import javax.annotation.Resources;

public class courseMapper {
    @Resources({
            @Resources(property = "courseId", colum = "course_id"),
            @Resources(property = "courseName", colum = "course_name"),
            @Resources(property = "userId", colum = "user_id"),
            @Resources(property = "courseClass", colum = "coures-class"),
            @Resources(property = "cover", colum = "cover"),
            @Resources(property = "courseCode", colum = "course_code"),
            @Resources(property = "finished", colum = "finished"),
    })
    @Select("SELECT * FROM t_course WHERE course_id = #{courseId}")
    Course getOne(Long courseId);

    @Delete("DELETE FROM t_course WHERE course_id =#{courseld}")
    void delete(Long courseId);

    @Insert("INSERT INTO t_course(courde_name,user_id,course_class,covr)")


}












