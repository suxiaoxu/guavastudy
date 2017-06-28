package apache.commons.beanutils.model;

import java.util.Date;
import java.util.List;

/**
 * Created by xiaoxu.sxx on 2017/6/27.
 */
public class ClassRoom {

    private String name;

    private int age;

    private Date brithDay;

    private List<Address> list;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
    }

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }
}
