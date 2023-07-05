package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mendy
 * @create 2023-07-05 8:06
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}

