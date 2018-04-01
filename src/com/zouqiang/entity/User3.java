package com.zouqiang.entity;

import java.io.Serializable;
import java.util.List;

public class User3 implements Serializable {
    private boolean reader;
    private List<String> courses;

    public User3() {
        super();
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "User3{" +
                "reader=" + reader +
                ", courses=" + courses +
                '}';
    }
}
