package net.sf.cglib.bean;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.ClassRoom;
import apache.commons.beanutils.model.ClassRoomTest;
import net.sf.cglib.beans.BeanCopier;
import org.junit.Test;

import java.util.Date;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class CiglibCopyObject {

    /**
     * 对象拷贝cglib。
     */
    @Test
    public void cglibCopyObject(){
        ClassRoom classRoom = BeanCreate.getClassRoom();
        ClassRoom classRoom1 = new ClassRoom();
        System.out.println(new Date().getTime());
        BeanCopier copier = BeanCopier.create(ClassRoom.class, ClassRoom.class, false);
        copier.copy(classRoom, classRoom1, null);
        System.out.println(new Date().getTime());
        System.out.println(classRoom1.getName());
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
