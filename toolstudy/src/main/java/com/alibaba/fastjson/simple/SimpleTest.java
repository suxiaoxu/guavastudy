package com.alibaba.fastjson.simple;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class SimpleTest {
    @Test
    public void test(){

        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);
        group.setDate(new Date());
        // 对象转化成jsonString
        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);

        //String 转化成对象
        Group group1 = JSON.parseObject(jsonString, Group.class);
        System.out.println(group.getDate().getTime());
    }
}
