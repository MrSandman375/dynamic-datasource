package com.mmg.dynamicdatasource.api;

import com.mmg.dynamicdatasource.service.test.TestService;
import com.mmg.dynamicdatasource.service.user_db.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@RestController
@RequestMapping("/")
public class Api {

    @Autowired
    private TestService testService;
    @Autowired
    private SysUserService userService;

    @GetMapping("/test")
    public void test(){
        testService.test();
    }

    @GetMapping("/user")
    public void user(){
        userService.user();
    }
}
