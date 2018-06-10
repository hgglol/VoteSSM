package com.hgg.service;

import com.hgg.po.User;

/*
* 用户Service层接口
* */
public interface UserService {
    public User findUser(String loginAccount,String loginPassword);
}
