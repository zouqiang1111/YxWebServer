package com.zouqiang.entity;

import java.io.Serializable;

/**
 * 邹强
 * 2018-4-3 9:41
 */
public class Card implements Serializable {
    private Integer id;//主键id
    private String code;//身份证编号

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

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
