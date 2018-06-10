package com.hgg.service.serviceImpl;

import com.hgg.dao.UserDao;
import com.hgg.po.User;
import com.hgg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
* 用户Service接口实现
* */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
//    注入UserDao
    @Autowired
    private UserDao userDao;
//    通过账号密码查询用户
    @Override
    public User findUser(String loginAccount, String loginPassword) {
        User user = this.userDao.findUser(loginAccount,loginPassword);
        return user;
    }
}
