package com.gec.controller;

import com.gec.entity.DeviceRun;
import com.gec.mapper.RunMapper;
import com.gec.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class runController {
    private SqlSession sqlSession = MybatisUtils.getSqlSession();
    private RunMapper runMapper =sqlSession.getMapper(RunMapper.class);
    //通过对象删除
    public void delete(DeviceRun deviceRun){
        runMapper.delete(deviceRun);
        sqlSession.commit();
    }
    //通过设备id删除
    public void delete(String idRun){
        runMapper.delete(idRun);
        sqlSession.commit();
    }
    //删除该实验室内的设备记录
    public void deleteLabName(String LabName){
        runMapper.deleteLabName(LabName);
        sqlSession.commit();
    }

    //查找所有
    public List<DeviceRun> select(){
        return runMapper.select();
    }
    //通过设备id查找
    public DeviceRun selectID(String idRun){ return runMapper.selectID(idRun); }
    //通过实验室名称查找
    public DeviceRun selectLabName(String LabName){ return runMapper.selectLabName(LabName); }
    //通过年或者月或者联合查询 其中年为year,月为month。
    public List<DeviceRun> selectByDate(Map<String,String> map){
        return runMapper.selectByDate(map);
    }

    //通过传对象更新对象的运行状态
    public void update(DeviceRun n){
        runMapper.update(n);
        sqlSession.commit();
    }

    public void insert(DeviceRun n){
        runMapper.insert(n);
        sqlSession.commit();
    }
}
