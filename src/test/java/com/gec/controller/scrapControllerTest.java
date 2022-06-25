package com.gec.controller;

import com.gec.entity.DeviceScrap;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class scrapControllerTest {

    @Test
    public void insertTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<scrapController> aClass = scrapController.class;
        scrapController instance = aClass.newInstance();
        DeviceScrap deviceScrap = new DeviceScrap();
        deviceScrap.setName("投影");
        deviceScrap.setId("6");
        deviceScrap.setType("Ntest");

        aClass.getDeclaredMethod("insert", DeviceScrap.class).invoke(instance,deviceScrap);

        List<DeviceScrap> list = (List<DeviceScrap>) aClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }

    @Test
    public void selectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<scrapController> aClass = scrapController.class;
        scrapController instance = aClass.newInstance();
        List<DeviceScrap> list = (List<DeviceScrap>) aClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }

    @Test
    public void deleteTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<scrapController> aClass = scrapController.class;
        scrapController instance = aClass.newInstance();
        aClass.getDeclaredMethod("delete", String.class).invoke(instance,"27");

        List<DeviceScrap> list = (List<DeviceScrap>) aClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }

    @Test
    public void updataTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<scrapController> aClass = scrapController.class;
        scrapController instance = aClass.newInstance();
        DeviceScrap deviceScrap = new DeviceScrap();
        deviceScrap.setName("投影");
        deviceScrap.setId("6");
        deviceScrap.setType("Ntest");
        deviceScrap.setScrapBatch("3");
        deviceScrap.setDate("2020-07-29 18:33:24");
        aClass.getDeclaredMethod("update", DeviceScrap.class).invoke(instance,deviceScrap);

        List<DeviceScrap> list = (List<DeviceScrap>) aClass.getDeclaredMethod("select").invoke(instance);
        list.forEach(System.out::println);
    }
}
