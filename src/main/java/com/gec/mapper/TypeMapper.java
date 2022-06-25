package com.gec.mapper;

import com.gec.entity.DeviceRun;
import com.gec.entity.DeviceType;

import java.util.List;
import java.util.Map;

public interface TypeMapper {
    int insert(DeviceType deviceType);

    List<DeviceType> select();
    DeviceType selectByID(String ID);
    DeviceType selectByDeviceRun(DeviceRun deviceRun);
    List<DeviceType> selectByDate(Map<String,String> map);

    int update(DeviceType deviceType);

    int delete(DeviceType deviceType);
    int delete(String id);
}
