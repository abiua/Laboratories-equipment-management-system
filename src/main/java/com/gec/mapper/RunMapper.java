package com.gec.mapper;

import com.gec.entity.DeviceRun;

import java.util.List;
import java.util.Map;

public interface RunMapper {
    int insert(DeviceRun deviceRun);

    List<DeviceRun> select();
    DeviceRun selectID(String idRun);
    DeviceRun selectLabName(String LabName);
    List<DeviceRun> selectByDate(Map<String,String> map);

    int update(DeviceRun deviceRun);

    int delete(DeviceRun deviceRun);
    int delete(String idRun);
    int deleteLabName(String LabName);

}
