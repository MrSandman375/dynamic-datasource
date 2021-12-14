package com.mmg.dynamicdatasource.entity.test;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2021/12/13
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "test")
public class Test {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private String city;
    private String area;
}
