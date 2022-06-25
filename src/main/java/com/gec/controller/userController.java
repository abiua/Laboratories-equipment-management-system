package com.gec.controller;
import com.gec.entity.user;
import com.gec.mapper.userMapper;
import com.gec.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class userController {

    private SqlSession sqlSession = MybatisUtils.getSqlSession();
    private userMapper userMapper =sqlSession.getMapper(userMapper.class);
    //通过id进行删除
    public void delete(user n){
        userMapper.delete(n);
        sqlSession.commit();
    }
    public void delete(String id){
        userMapper.delete(id);
        sqlSession.commit();
    }
    //全查询
    public List<user> select(){
        return userMapper.select();
    }
    public user select(String id){
        return userMapper.select(id);
    }
    //通过id查询
    public Boolean selectIDExist(String id){ return userMapper.selectIDExist(id); }
    public Boolean selectIDExist(user user){ return userMapper.selectIDExist(user); }
    //通过id更新
    public void update(user n){
        userMapper.update(n);
        sqlSession.commit();
    }
    public void update(String id){
        userMapper.update(id);
        sqlSession.commit();
    }
    //插入 不需要传入id,id自动生成
    public void insert(user n){
        userMapper.insert(n);
        sqlSession.commit();
    }
}
