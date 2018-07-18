package com.jz.test.service.impl;

import com.jz.test.dao.Test;
import com.jz.test.dao.TestEnum;
import com.jz.test.service.TestService;
import com.jz.test.utils.BusinessException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by 姜哲 on 2018/7/18--14:18 service实现类
 */
@Service
public class TestServiceImpl implements TestService{
    @Override
    public Test exChangeRate(Test test) throws BusinessException {
        try {
            Double rate = TestEnum.getChangeRate(test.getFrom(),test.getTo());
            if(rate == null){
                throw new BusinessException("没有此种汇率转换");
            }
            Test finalTest = new Test();
            BigDecimal finalAmount = new BigDecimal(String.valueOf(test.getAmount()));
            finalTest.setAmount(finalAmount.multiply(BigDecimal.valueOf(rate)));
            finalTest.setRate(rate);
            finalTest.setFrom(test.getFrom());
            finalTest.setTo(test.getTo());
            return finalTest;
        }catch (Exception e){
            throw new BusinessException("转换失败",e.getMessage());
        }
    }
}
