package com.mmg.dynamicdatasource.service.test;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mmg.dynamicdatasource.mapper.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Service
@DS("master")
public class TestService {
    @Autowired
    private TestMapper mapper;

    public void test() {
        System.out.println(mapper.selectList(Wrappers.lambdaQuery()));
    }
}
