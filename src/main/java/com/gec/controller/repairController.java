package com.gec.controller;

import com.gec.entity.DeviceRepair;
import com.gec.entity.DeviceType;
import com.gec.mapper.RepairMapper;
import com.gec.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class repairController {
    private SqlSession sqlSession = MybatisUtils.getSqlSession();
    private RepairMapper repairMapper =sqlSession.getMapper(RepairMapper.class);

    //通过repairID删除
    public void delete(DeviceRepair deviceRepair){
        repairMapper.delete(deviceRepair);
        sqlSession.commit();
    }
    public void delete(String repairID){
        repairMapper.delete(repairID);
        sqlSession.commit();
    }

    //查询全部
    public List<DeviceRepair> select(){
        return repairMapper.select();
    }
    //查询id是否存在
    public Boolean selectIDExist(String id){
        return repairMapper.selectIDExist(id);
    }
    public List<DeviceRepair> selectByDate(Map<String,String> map){
        return repairMapper.selectByDate(map);
    }

    //通过查找repairID更新
    public void update(DeviceRepair deviceRepair){
        repairMapper.update(deviceRepair);
        sqlSession.commit();
    }

    //插入
    public void insert(DeviceRepair deviceRepair){
        repairMapper.insert(deviceRepair);
        sqlSession.commit();
    }
    public void insert(DeviceType deviceType){
        repairMapper.insert(deviceType);
        sqlSession.commit();
    }
}
