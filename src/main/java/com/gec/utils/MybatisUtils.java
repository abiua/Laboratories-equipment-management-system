package com.gec.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtils {
    // 注意：基于如果出现多个会话工厂，可能导致事务不同步的问题，所以我们一个项目只使用一个会话工厂
    public static final SqlSessionFactory SSF = createSqlSessionFactory();
    // 需求：实现同一条线程，使用的session是相同的。线程绑定,
    // 创建一个线程绑定变量，将变量放在该对象里面，表示对象同一条线程共享
    private static final ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    // 1.获得会话工厂
    private static SqlSessionFactory createSqlSessionFactory() {
        try {
            // 1.返回一个Reader对象
            Reader reader = Resources.getResourceAsReader("mybatis-cfg.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sessionFactory = builder.build(reader);
            return sessionFactory;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    // 2.获得操作对象，SqlSession对象

    public static SqlSession getSqlSession() {
        //1.判断线程变量里面是否已经有值
        if (threadLocal.get() == null) {
            //2.如果没有值，那么创建一个session对象设置在线程变量里面
            SqlSession session = SSF.openSession();
            threadLocal.set(session);
        }
        //3.返回线程变量里面的session对象
        return threadLocal.get();
    }
}
