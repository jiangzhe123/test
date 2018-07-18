package com.jz.test.controller;

import com.jz.test.dao.Test;
import com.jz.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by 姜哲 on 2018/7/18--14:16  controller层
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;
    /**
     * 转化 restfulapi接口  @PathVariable是用来获得请求url中的动态参数的
     */
    @RequestMapping("/exChangeRate/{from}/{to}")
    public HashMap<String, Object> exChangeRate(BigDecimal amount, @PathVariable("from") String from, @PathVariable("to") String to) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        Test test = new Test();
        test.setAmount(amount);
        test.setFrom(from);
        test.setTo(to);
        Test finalTest = testService.exChangeRate(test);
        result.put("data",finalTest);
        return result;
    }
}
