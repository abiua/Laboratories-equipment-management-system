package com.gec.controller;

import com.gec.entity.DeviceType;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class typeControllerTest {
    @Test
    public void insertTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        DeviceType deviceType = new DeviceType(null,"328", "328","328","328","328.0", "328","328", "1", "1");
        deviceType.setId(null);
        Class aClass = typeController.class;
        typeController instance = (typeController) aClass.newInstance();


        aClass.getDeclaredMethod("insert", DeviceType.class).invoke(instance,deviceType);
    }

    @Test
    public void selectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class aClass = typeController.class;
        typeController instance = (typeController) aClass.newInstance();

        Map<String,String> map = new HashMap<>();
        map.put("month","4");
        map.put("year","2021");

        List<DeviceType> list = (List<DeviceType>) aClass.getDeclaredMethod("selectByDate", Map.class).invoke(instance,map);
        list.forEach(System.out::println);
    }

    @Test
    public void deleteTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class aClass = typeController.class;
        typeController instance = (typeController) aClass.newInstance();
        aClass.getDeclaredMethod("delete", String.class).invoke(instance,"16");
        List<DeviceType> list = (List<DeviceType>) aClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }

    @Test
    public void updataTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class aClass = typeController.class;
//        typeController instance = (typeController) aClass.newInstance();
//
//        DeviceType selectByID = (DeviceType) aClass.getDeclaredMethod("selectByID", String.class).invoke(instance, "15");
//        selectByID.setBuyerName("新测试");
//        aClass.getDeclaredMethod("update", DeviceType.class).invoke(instance,selectByID);
//        List<DeviceType> list = (List<DeviceType>) aClass.getDeclaredMethod("select").invoke(instance);
//        list.forEach(System.out::println);
    }
}
