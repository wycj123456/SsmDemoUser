package com.dhy.service;

import com.dhy.bean.TbUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by szy
 * 2019/8/13 8:46
 */
public interface IUserService {
    List<TbUser> findAll();

    int deleteById(int id);

    int addUser(TbUser tbUser);

    int updateUser(TbUser tbUser);

    TbUser queryById(int id);

    boolean isUserExist(String username);

    String getPasswordByUsername(String username);
}
