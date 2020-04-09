package com.jingchuang.test.dao;

import com.jingchuang.test.entiy.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    List<User> getUsers();
}
