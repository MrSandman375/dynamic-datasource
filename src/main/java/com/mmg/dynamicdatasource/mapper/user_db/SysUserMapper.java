package com.mmg.dynamicdatasource.mapper.user_db;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mmg.dynamicdatasource.entity.user_db.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    Integer getCount();
}
