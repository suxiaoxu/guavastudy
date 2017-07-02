package com.googel.common;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by xiaoxu.sxx on 2017/6/30.
 */
public class PreconditionsTest {

    @Test
    public void checkArgument(){
        int i = 10;
        Preconditions.checkArgument(i<10 ," this is error");
    }

    @Test
    public void checkoutNotNull(){
        Integer sn = 1;
        System.out.println(Preconditions.checkNotNull(sn,"this is not null"));
    }
}
