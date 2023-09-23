package com.cncs.dao.impl;

import com.cncs.dao.IUserDao;
import com.cncs.domain.User;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findAll() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql:///junior","root","root");

        PreparedStatement ps = conn.prepareCall("select * from user where id = 2");

        ResultSet rs = ps.executeQuery();

        List<User> users = new ArrayList<User>();
        while(rs.next()){
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            users.add(user);

        }
        rs.close();
        ps.close();
        conn.close();
        return users;

    }
}
