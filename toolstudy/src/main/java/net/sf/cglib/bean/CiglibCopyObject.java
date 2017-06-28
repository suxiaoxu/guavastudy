package net.sf.cglib.bean;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.ClassRoom;
import net.sf.cglib.beans.BeanCopier;
import org.junit.Test;

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
        BeanCopier copier = BeanCopier.create(ClassRoom.class, ClassRoom.class, false);
        copier.copy(classRoom, classRoom1, null);
        System.out.println(classRoom1.getName());
    }
}
