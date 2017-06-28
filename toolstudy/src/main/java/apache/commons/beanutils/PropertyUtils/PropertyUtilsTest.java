package apache.commons.beanutils.PropertyUtils;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.Address;
import apache.commons.beanutils.model.ClassRoom;
import apache.commons.beanutils.model.ClassRoomTest;
import apache.commons.beanutils.model.Teacher;
import com.google.common.collect.Lists;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Test;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by xiaoxu.sxx on 2017/6/27.
 */
public class PropertyUtilsTest {

    /**
     * 属性拷贝，双层拷贝
     */
    @Test
    public void propertyCopyUtils(){
        //对象拷贝
        ClassRoom classRoom1 = getObject();
        ClassRoom classRoom2 = new ClassRoom();
        ClassRoomTest classRoomTest = new ClassRoomTest();
        try {
            System.out.println(new Date().getTime());
            PropertyUtils.copyProperties(classRoom2,classRoom1);
            PropertyUtils.copyProperties(classRoomTest,classRoom1);
            System.out.println(new Date().getTime());

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(classRoom2.getAge());
        System.out.println(classRoomTest.getName());

    }

    @Test
    public void singleCopy(){
        Address address1 = new Address();
        address1.setName("sannian");
        Address address2 = new Address();
        try {
            System.out.println(new Date().getTime());
            for(int i = 0 ; i < 100; i++){
                PropertyUtils.copyProperties(address2,address1);
            }
            System.out.println(new Date().getTime());
            for(int i = 0 ; i < 100; i++){
                convertObject(address2,address1);
            }
            System.out.println(new Date().getTime());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * 属性文件读写工具，用于，反射时候使用
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     * @throws java.lang.reflect.InvocationTargetException
     */
    @Test
    public void testTeacher() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Teacher teacher = new Teacher();
        try {
            PropertyUtils.setProperty(teacher,"name","zhangsan");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(PropertyUtils.getProperty(teacher,"name"));
    }

    /**
     * 获取方法类型和描述
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    @Test
    public void preperyDesc() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Teacher teacher = new Teacher();
        PropertyUtils.setProperty(teacher,"name","zhangsan");
        PropertyDescriptor propertyDescriptor = PropertyUtils.getPropertyDescriptor(teacher,"name");
        System.out.println(propertyDescriptor.getPropertyType().getName());
    }

    /**
     * 获取属性类型
     */
    @Test
    public void getPropertyType() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> class1 = PropertyUtils.getPropertyType(BeanCreate.getAddress1(),"name");
        System.out.println(class1.getName());
    }

    private static void convertObject(Address address1,Address address2){
        address1.setName(address2.getName());
    }

    private static ClassRoom getObject(){
        ClassRoom classRoom = new ClassRoom();
        classRoom.setName("zhangsan");
        classRoom.setAge(3);
        classRoom.setBrithDay(new Date());
        Address address = new Address();
        address.setName("test1");
        classRoom.setList(Lists.newArrayList(address));
        return classRoom;
    }
}
