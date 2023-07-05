package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author Mendy
 * @create 2023-07-05 8:06
 */
@Data
@TableName("tbl_user")
public class User {
/*
//    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    @TableField(value = "pwd", select = false)
    private String password;

    private Integer age;
    private String tel;

    @TableField(exist = false)
    private Integer online;
*/


    /*@Data
    @TableName("tbl_user")
    public class User {
        @TableId(type = IdType.INPUT)
        private Long id;
        private String name;
        @TableField(value="pwd",select=false)
        private String password;
        private Integer age;
        private String tel;
        @TableField(exist=false)
        private Integer online;
    }*/

    /*@Data
    @TableName("tbl_user")
    public class User {
        @TableId(type = IdType.ASSIGN_ID)
        private Long id;
        private String name;
        @TableField(value="pwd",select=false)
        private String password;
        private Integer age;
        private String tel;
        @TableField(exist=false)
        private Integer online;
    }*/


    private Long id;

    private String name;

    @TableField(value = "pwd", select = false)
    private String password;

    private Integer age;
    private String tel;

    @TableField(exist = false)
    private Integer online;

//    @TableLogic(value = "0", delval = "1")
    private Integer deleted;

    @Version
    private Integer version;



}
