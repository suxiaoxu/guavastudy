package jdk.clone;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class Employee implements Cloneable{

    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }
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
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public Employee clone(){
        Employee employee = null;
        try {
            employee = (Employee) super.clone();
            employee.address = address.clone();  //对引用类型的域进行克隆
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + name + ",");
        sb.append("年龄：" + age+ ", ");
        sb.append("地址：" + address);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("克隆之前:");
        Address address = new Address("中国", "吉林", "长春");
        Employee employee1 = new Employee("明日科技", 12, address);
        System.out.println("员工1信息：" + employee1 );

        Employee employee2 = employee1.clone();

        employee2.getAddress().setState("中国");
        employee2.getAddress().setProvince("四川");
        employee2.getAddress().setCity("成都");

        System.out.println("克隆之后：");
        System.out.println("员工2信息：" + employee2);
        System.out.println("员工1信息：" + employee1);
    }
}
