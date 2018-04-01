package com.zouqiang.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 邹强
 * @CreateDate: 2018/4/1 23:23
 **/
public class FormatString implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "FormatString{" +
                "birthday=" + birthday +
                ", total=" + total +
                ", discount=" + discount +
                ", money=" + money +
                '}';
    }
}
