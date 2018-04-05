package com.zouqiang.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 邹强
 * 2018-4-3 1:28
 */
public class Clazz implements Serializable {
    private Integer id;//班级id，主键
    private String code;//班级编号
    private String name;//班级名称
    private List<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
