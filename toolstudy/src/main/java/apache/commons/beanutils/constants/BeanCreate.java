package apache.commons.beanutils.constants;

import apache.commons.beanutils.model.Address;
import apache.commons.beanutils.model.ClassRoom;
import com.google.common.collect.Lists;

import java.util.Date;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class BeanCreate {

    public static ClassRoom getClassRoom(){
        ClassRoom classRoom = new ClassRoom();
        classRoom.setName("zhangsan");
        classRoom.setAge(12);
        classRoom.setBrithDay(new Date());
        classRoom.setList(Lists.newArrayList(getAddress1(),getAddress2()));
        return classRoom;
    }

    public static Address getAddress1(){
        Address address = new Address();
        address.setName("address1");
        return address;
    }

    public static Address getAddress2(){
        Address address = new Address();
        address.setName("address2");
        return address;
    }
}
