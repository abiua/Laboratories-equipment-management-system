package com.gec.mapper;

import com.gec.entity.user;

import java.util.List;

public interface userMapper {
    int insert(user user);

    List<user> select();
    user select(String id);
    Boolean selectIDExist(String id);
    Boolean selectIDExist(user user);

    int update(user user);
    int update(String id);

    int delete(user user);
    int delete(String id);
}

