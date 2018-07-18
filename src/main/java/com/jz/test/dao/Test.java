package com.jz.test.dao;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * Created by 姜哲 on 2018/7/18--14:21 实体类
 */
public class Test implements Serializable{
    /**
     * 面值
     */
    private BigDecimal amount;
    /**
     * 汇率
     */
    private Double rate;
    /**
     * 转换前国家
     */
    private String from;
    /**
     * 转换后国家
     */
    private String to;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
