package com.jz.test.service;

import com.jz.test.dao.Test;
import com.jz.test.utils.BusinessException;

/**
 * Created by 姜哲 on 2018/7/18--14:17 service 接口
 */
public interface TestService {
    /**
     *业务方法
     */
    Test exChangeRate(Test test) throws BusinessException;
}
