package com.gec.mapper;

import com.gec.entity.DeviceScrap;

import java.util.List;
import java.util.Map;

public interface ScrapMapper {
    int insert(DeviceScrap deviceScrap);

    List<DeviceScrap> select();
    List<DeviceScrap> selectType(String type);
    List<DeviceScrap> selectType(DeviceScrap deviceScrap);

    List<DeviceScrap> selectYear(String year);
    List<DeviceScrap> selectMonth(String month);
    List<DeviceScrap> selectByDate(Map<String ,String> map);


    int update(DeviceScrap deviceScrap);

    int delete(DeviceScrap deviceScrap);
    int delete(String scrapBatch);
}
