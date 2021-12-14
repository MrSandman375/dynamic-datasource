package com.mmg.dynamicdatasource.mapper.test;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mmg.dynamicdatasource.entity.test.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
