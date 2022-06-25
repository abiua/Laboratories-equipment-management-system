package com.gec.controller;

import com.gec.entity.DeviceRun;
import com.gec.entity.DeviceType;
import com.gec.mapper.TypeMapper;
import com.gec.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class typeController {
    private SqlSession sqlSession = MybatisUtils.getSqlSession();
    private TypeMapper typeMapper =sqlSession.getMapper(TypeMapper.class);

    public void delete(DeviceType deviceType){
        typeMapper.delete(deviceType);
        sqlSession.commit();
    }
    public void delete(String id){
        typeMapper.delete(id);
        sqlSession.commit();
    }

    public List<DeviceType> select(){
        return typeMapper.select();
    }

    public DeviceType selectByID(String ID){
        return typeMapper.selectByID(ID);
    }
    public DeviceType selectByDeviceRun(DeviceRun deviceRun){
        return typeMapper.selectByDeviceRun(deviceRun);
    }
    public List<DeviceType> selectByDate(Map<String,String> map){
        return typeMapper.selectByDate(map);
    }

    public void update(DeviceType n){
        typeMapper.update(n);
        sqlSession.commit();
    }

    public void insert(DeviceType n){
        typeMapper.insert(n);
        sqlSession.commit();
    }
}
