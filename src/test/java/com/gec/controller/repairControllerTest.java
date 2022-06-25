package com.gec.controller;


import com.gec.entity.DeviceRepair;
import com.gec.entity.user;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class repairControllerTest {

    @Test
    public void insertTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class controllerClass = repairController.class;
        repairController instance = (repairController) controllerClass.newInstance();

        Class<userController> userControllerClass = userController.class;
        userController userController = userControllerClass.newInstance();
        List<user> list = (List<user>) userControllerClass.getDeclaredMethod("select").invoke(userController);

        DeviceRepair repair = new DeviceRepair();
        repair.setBuyerID(list.get(0).getId());
        repair.setBuyerName(list.get(0).getName());
        repair.setHeadID(list.get(0).getId());
        repair.setHeadName(list.get(0).getName());
        repair.setId("22");
        repair.setName("328");
        repair.setRepairFac("666");
        repair.setRepairMoney("1000000");
        repair.setType("328");
        controllerClass.getDeclaredMethod("insert", DeviceRepair.class).invoke(instance,repair);

        List<DeviceRepair> repairList = (List<DeviceRepair>) controllerClass.getDeclaredMethod("select").invoke(instance);
        repairList.forEach(System.out::println);
    }

    @Test
    public void selectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class controllerClass = repairController.class;
        repairController instance = (repairController) controllerClass.newInstance();


        Map<String,String> map = new HashMap<>();
//        map.put("month","4");
        map.put("year","2021");
        List<DeviceRepair> list = (List<DeviceRepair>) controllerClass.getDeclaredMethod("selectByDate", Map.class).invoke(instance,map);
        list.forEach(System.out::println);


//        List<DeviceRepair> list = (List<DeviceRepair>) controllerClass.getDeclaredMethod("select").invoke(instance);
//        list.forEach(System.out::println);
    }

    @Test
    public void deleteTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class controllerClass = repairController.class;
        repairController instance = (repairController) controllerClass.newInstance();

        controllerClass.getDeclaredMethod("delete", String.class).invoke(instance,"4");


        List<DeviceRepair> list = (List<DeviceRepair>) controllerClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }

    @Test
    public void updataTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class controllerClass = repairController.class;
        repairController instance = (repairController) controllerClass.newInstance();

        Class<userController> userControllerClass = userController.class;
        userController userController = userControllerClass.newInstance();
        List<user> list = (List<user>) userControllerClass.getDeclaredMethod("select").invoke(userController);

        DeviceRepair repair = new DeviceRepair();
        repair.setBuyerID(list.get(0).getId());
        repair.setBuyerName(list.get(0).getName());
        repair.setHeadID(list.get(0).getId());
        repair.setHeadName(list.get(0).getName());
        repair.setId("6");
        repair.setName("投影");
        repair.setRepairFac("投影修理厂");
        repair.setRepairMoney("1000000");
        repair.setType("Ntest");
        repair.setRepairID("1");
        controllerClass.getDeclaredMethod("update", DeviceRepair.class).invoke(instance,repair);


        List<DeviceRepair> listRepair = (List<DeviceRepair>) controllerClass.getDeclaredMethod("select").invoke(instance);
        listRepair.forEach(System.out::println);
    }
}
