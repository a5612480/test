package cn.it.service.impl;

import cn.it.dao.Dao;
import cn.it.dao.DaoImpl.DaoImpl;
import cn.it.domain.User;
import cn.it.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private Dao dao = new DaoImpl();
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
