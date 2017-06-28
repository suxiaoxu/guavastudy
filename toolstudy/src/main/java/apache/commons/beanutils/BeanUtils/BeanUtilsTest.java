package apache.commons.beanutils.BeanUtils;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.ClassRoom;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 * 这两个类几乎有一摸一样的功能，唯一的区别是：BeanUtils在对Bean赋值是会进行类型转化。
 * 举例来说也就是在copyProperty时只要属性名相同，就算类型不同，
 * BeanUtils也可以进行copy；而PropertyBean则可能会报错！！
 */
public class BeanUtilsTest {
    @Test
    public void beanUtilTest(){
        //1.设置javabean参数
        ClassRoom classRoom1 = new ClassRoom();
        ClassRoom classRoom2 = BeanCreate.getClassRoom();
        try {
            BeanUtils.setProperty(classRoom1, "name", "zhangsan");
            System.out.println(classRoom1.getName());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void copyBean(){

        ClassRoom classRoom1 = new ClassRoom();
        ClassRoom classRoom2 = BeanCreate.getClassRoom();
        try {
            BeanUtils.copyProperties(classRoom1,classRoom2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(classRoom1.getAge());
    }

    @Test
    public void mapToBean(){
        Map<String,Object> maps = new HashMap<String, Object>();
        maps.put("name","lisi");
        maps.put("age",23);
        maps.put("brithDay",new Date());
        ClassRoom classRoom = new ClassRoom();
        try {
            BeanUtils.copyProperties(classRoom,maps);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(classRoom.getName());
    }
}
