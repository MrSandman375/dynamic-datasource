package com.mmg.dynamicdatasource.entity.user_db;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser {

    @TableId(value = "user_id", type = IdType.ASSIGN_UUID)
    private String userId;
    private String userName;
    private String userPass;
    private String userMail;
    private Integer userActive;
    private Integer userLocked;
    private Date createTime;
    private Date updateTime;
    @TableLogic(delval = "1")
    private Integer isDel;
}
