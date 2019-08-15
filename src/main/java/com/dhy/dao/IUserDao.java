package com.dhy.dao;

import com.dhy.bean.TbUser;

import java.util.List;

public interface IUserDao {

    List<TbUser> findAll();

    int deleteById(int id);

    int addUser(TbUser tbUser);

    int updateUser(TbUser tbUser);

    TbUser queryById(int id);

    TbUser selectUsername(String username);
}
