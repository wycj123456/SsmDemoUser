package com.dhy.service.impl;

import com.dhy.bean.TbUser;
import com.dhy.dao.IUserDao;
import com.dhy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by szy
 * 2019/8/13 8:47
 */
@Service
public class UserServiceimpl implements IUserService {

    //相当于new，注入
    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<TbUser> findAll() {
        return iUserDao.findAll();
    }

    @Override
    public int deleteById(int id) {
        return iUserDao.deleteById(id);
    }

    @Override
    public int addUser(TbUser tbUser) {
        return iUserDao.addUser(tbUser);
    }

    @Override
    public int updateUser(TbUser tbUser) {
        return iUserDao.updateUser(tbUser);
    }

    @Override
    public TbUser queryById(int id) {
        return iUserDao.queryById(id);
    }

    //判断用户名是否存在
    @Override
    public boolean isUserExist(String username){
        if (iUserDao.selectUsername(username) == null)
            return false;
        else
            return true;
    }

    //根据username 获取数据库 password
    @Override
    public String getPasswordByUsername(String username){
        return iUserDao.selectUsername(username).getPassword();
    }
}
