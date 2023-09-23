package com.cncs.test;

import com.cncs.dao.IUserDao;
import com.cncs.dao.impl.UserDaoImpl;
import com.cncs.domain.User;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void findAll() throws Exception{
        IUserDao userdao = new UserDaoImpl();
        List<User> users = userdao.findAll();
        System.out.println(users);



    }
}
