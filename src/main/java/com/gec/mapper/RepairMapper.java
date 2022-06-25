package com.gec.mapper;

import com.gec.entity.DeviceRepair;
import com.gec.entity.DeviceType;

import java.util.List;
import java.util.Map;

public interface RepairMapper {
    int insert(DeviceRepair deviceRepair);
    int insert(DeviceType deviceType);

    List<DeviceRepair> select();
    Boolean selectIDExist(String id);
    List<DeviceRepair> selectByDate(Map<String,String> map);

    int update(DeviceRepair deviceRepair);

    int delete(DeviceRepair deviceRepair);
    int delete(String repairID);
}
