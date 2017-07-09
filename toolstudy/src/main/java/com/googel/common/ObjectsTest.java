package com.googel.common;

import apache.commons.beanutils.model.Address;
import org.junit.Test;

import java.util.Objects;


/**
 * Created by xiaoxu.sxx on 2017/6/30.
 */
public class ObjectsTest {

    @Test
    public void objectsEquals(){
        System.out.println(Objects.equals(null,""));
        System.out.println(Objects.equals("12", "12"));
        Address address = new Address();
        address.setName("23");
        Address address1 = new Address();
        address1.setName("23");
        System.out.println(Objects.equals(address,address1));
        System.out.println(Objects.hashCode(address));
        System.out.println(Objects.toString(address));
        System.out.println(Objects.toString(address,"this"));
        //System.out.println(Objects.toStringHelper(this).add("x", 1).toString());
    }
}
