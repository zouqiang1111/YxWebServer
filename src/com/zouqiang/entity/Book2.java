package com.zouqiang.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Book2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement
    private Integer id;
    @XmlElement
    private String name;
    @XmlElement
    private String author;

    public Book2() {
        super();
    }

    public Book2(Integer id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @XmlTransient
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

}
