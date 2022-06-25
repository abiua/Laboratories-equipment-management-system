package com.gec.controller;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class userControllerTest {
    @Test
    public void insertTest(){

    }

    @Test
    public void selectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class userControllerClass = userController.class;
        userController instance = (userController)userControllerClass.newInstance();
        Boolean selectIDExist = (Boolean) userControllerClass.getDeclaredMethod("selectIDExist", String.class).invoke(instance, "0");
        System.out.println(selectIDExist);
    }

    @Test
    public void deleteTest(){

    }

    @Test
    public void updataTest(){

    }
}
