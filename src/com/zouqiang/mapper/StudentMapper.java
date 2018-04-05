package com.zouqiang.mapper;

import com.zouqiang.entity.Student;

/**
 * 邹强
 * 2018-4-3 1:36
 */
public interface StudentMapper {
    //根据id查询学生信息
    Student selectStudentById(Integer id);
}
