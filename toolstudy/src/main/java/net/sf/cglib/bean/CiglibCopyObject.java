package net.sf.cglib.bean;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.Address;
import apache.commons.beanutils.model.ClassRoom;
import apache.commons.beanutils.model.ClassRoomTest;
import com.google.common.collect.Lists;
import net.sf.cglib.beans.BeanCopier;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class CiglibCopyObject {

    /**
     * 对象拷贝cglib。
     */
    @Test
    public void cglibCopyObject(){
        long start = new Date().getTime();
        for(int i = 1;i < 10000 ;i++){
            ClassRoom classRoom = BeanCreate.getClassRoom();
            ClassRoom classRoom1 = new ClassRoom();
            //System.out.println(new Date().getTime());
            BeanCopier copier = BeanCopier.create(ClassRoom.class, ClassRoom.class, false);
            copier.copy(classRoom, classRoom1, null);
        }
        long end = new Date().getTime();
        //System.out.println(new Date().getTime());
        System.out.println(end-start);
    }

    @Test
    public void copyObjectsTest(){
        long start = new Date().getTime();
        for(int i = 1;i < 10000 ;i++){
            ClassRoom classRoom = BeanCreate.getClassRoom();
            ClassRoom classRoom1 = new ClassRoom();
            classRoom1.setName(classRoom.getName());
            classRoom1.setAge(classRoom.getAge());
            classRoom1.setBrithDay(classRoom.getBrithDay());
            classRoom1.setLitest(classRoom.getLitest());
            classRoom1.setList(classRoom.getList());
        }
        long end = new Date().getTime();
        //System.out.println(new Date().getTime());
        System.out.println(end-start);
    }

    @Test
    public void differentObjct(){
        ClassRoom classRoom = BeanCreate.getClassRoom();
        ClassRoomTest classRoomTest = new ClassRoomTest();
        System.out.println(new Date().getTime());
        BeanCopier copier = BeanCopier.create(ClassRoom.class, ClassRoomTest.class, false);
        copier.copy(classRoom,classRoomTest,null);
        System.out.println(new Date().getTime());
        System.out.println(classRoomTest.getName());
        System.out.println(classRoomTest.getAge());
        System.out.println(classRoomTest.getAdd());
    }
}
