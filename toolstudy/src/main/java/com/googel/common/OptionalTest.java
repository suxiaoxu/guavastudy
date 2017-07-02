package com.googel.common;

import com.google.common.base.Strings;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by xiaoxu.sxx on 2017/6/30.
 */
public class OptionalTest {
    @Test
    public void optionTest(){
        //包装对象
        Optional<Integer> possible = Optional.of(5);
        //判断对象在内是否存在
        if(possible.isPresent()){
            //获取对象内容
            System.out.println(possible.get());
        }
        Integer sn = null;
        Integer sn1 = 2;
        //如果为空可以替换为另外一个对象
        Integer possible1 = Optional.ofNullable(sn).orElse(sn1);
        System.out.println(possible1);
    }

    @Test
    public void replaceTest(){
        String sn = "";
        String sn1 = null;
        System.out.println(Strings.isNullOrEmpty(sn));
        System.out.println(Strings.emptyToNull(sn1));
        System.out.println(Strings.nullToEmpty(sn));
    }
}
