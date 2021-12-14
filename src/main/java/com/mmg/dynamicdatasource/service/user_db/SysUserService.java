package com.mmg.dynamicdatasource.service.user_db;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mmg.dynamicdatasource.mapper.user_db.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper mapper;

    @DS("slave")
    public void user() {
        System.out.println(mapper.selectList(Wrappers.lambdaQuery()));
        System.out.println(mapper.getCount());
    }


}
