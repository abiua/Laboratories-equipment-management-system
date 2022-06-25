package com.gec.controller;

import com.gec.entity.DeviceRun;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class runControllerTest {

    @Test
    public void insertTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class runClass = runController.class;
//        runController in = (runController) runClass.newInstance();
//        DeviceRun deviceRun = new DeviceRun();
//        deviceRun.setIdRun("21");
//        deviceRun.setLabName("1号");
//        deviceRun.setNameRun("328");
//        deviceRun.setDateRun(LocalDateTime.now().toString());
//        runClass.getDeclaredMethod("insert", DeviceRun.class).invoke(in,deviceRun);
//
//        List<DeviceRun> list = (List<DeviceRun>) runClass.getDeclaredMethod("select").invoke(in);
//        list.forEach(System.out::println);
    }

    @Test
    public void selectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class runClass = runController.class;
        runController in = (runController) runClass.newInstance();
        Map<String,String> map = new HashMap<>();
        map.put("month","4");
        map.put("year","2021");


        List<DeviceRun> list = (List<DeviceRun>) runClass.getDeclaredMethod("selectByDate", Map.class).invoke(in,map);
        list.forEach(System.out::println);
    }

    @Test
    public void deleteTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class runClass = runController.class;
        runController in = (runController) runClass.newInstance();

        runClass.getDeclaredMethod("delete", String.class).invoke(in,"21");

        List<DeviceRun> list = (List<DeviceRun>) runClass.getDeclaredMethod("select").invoke(in);
        list.forEach(System.out::println);
    }

    @Test
    public void updataTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class runClass = runController.class;
//        runController in = (runController) runClass.newInstance();
//        DeviceRun deviceRun = (DeviceRun) runClass.getDeclaredMethod("selectID", String.class).invoke(in,"21");
//        deviceRun.setRun("空闲");
//
//        runClass.getDeclaredMethod("update", DeviceRun.class).invoke(in,deviceRun);
//
//        List<DeviceRun> list = (List<DeviceRun>) runClass.getDeclaredMethod("select").invoke(in);
//        list.forEach(System.out::println);
    }
}
