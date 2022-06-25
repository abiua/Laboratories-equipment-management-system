package com.gec.controller;

import com.gec.entity.DeviceScrap;
import com.gec.mapper.ScrapMapper;
import com.gec.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class scrapController {

    private SqlSession sqlSession = MybatisUtils.getSqlSession();
    ScrapMapper scrapMapper = sqlSession.getMapper(ScrapMapper.class);

    //按传入的对象的scrapBatch删除
    public void delete(DeviceScrap deviceScrap){
        scrapMapper.delete(deviceScrap);
        sqlSession.commit();
    }
    public void delete(String scrapBatch){
        scrapMapper.delete(scrapBatch);
        sqlSession.commit();
    }

    //查询全部
    public List<DeviceScrap> select(){
        return scrapMapper.select();
    }
    //通过type查询
    public List<DeviceScrap> selectType(String type){
        return scrapMapper.selectType(type);
    }
    //通过传入的scrap对象查询相同的type
    public List<DeviceScrap> selectType(DeviceScrap deviceScrap){
        return scrapMapper.selectType(deviceScrap);
    }
    //按年份查询
    public List<DeviceScrap> selectYear(String year){
        return scrapMapper.selectYear(year);
    }
    //按月份查询
    public List<DeviceScrap> selectMonth(String month){
        return scrapMapper.selectMonth(month);
    }

    public List<DeviceScrap> selectByDate(Map<String,String> map) { return scrapMapper.selectByDate(map); }

    //按scrapBatch来修改
    public void update(DeviceScrap n){
        scrapMapper.update(n);
        sqlSession.commit();
    }

    //直接insert，需要传入id ,name, type； scrapBatch自增不需要定义
    public void insert(DeviceScrap n){
        scrapMapper.insert(n);
        sqlSession.commit();
    }

}
