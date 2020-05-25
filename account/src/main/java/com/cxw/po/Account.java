package com.cxw.po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("account")
public class Account {

    @TableId
    private int id;

    @TableField("name")
    private String name;

    @TableField("age")
    private int age;
}
