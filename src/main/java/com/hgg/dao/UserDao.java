package com.hgg.dao;

import com.hgg.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
/*
* 通过账号和密码查询用户
* */
    public User findUser(@Param("loginAccount") String loginAccount,
                         @Param("loginPassword") String loginPassword);
}
