package com.jz.test.dao;


/**
 * Created by 姜哲 on 2018/7/18--15:42  枚举
 */
public enum TestEnum {
    /**
     * 中国 CN 美国 US 英国 GB 日本 JP
     */
    CU("CN","US",0.2),CG("CN","GB",0.1),CJ("CN","JP",100.00),UG("US","GB",0.5),
    UC("US","CN",5.0),GC("GB","CN",10.0),JC("JP","CN",0.01),GU("GB","US",2.0);

    /**
     * 转换前国家
     */
    private String from;
    /**
     * 转换后国家
     */
    private String to;
    /**
     * 汇率
     */
    private Double  rate;

    /**
     * 构造方法
     */
    TestEnum(String from, String to, Double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public static Double getChangeRate(String from, String to) {
        for(TestEnum testEnum : TestEnum.values()) {
            if (from.equals(testEnum.getFrom()) && to.equals(testEnum.getTo())) {
                return testEnum.getRate();
            }
        }
        //存储的转换汇率没有时
        return null;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
