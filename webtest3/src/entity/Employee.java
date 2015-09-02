package entity;

/**
 * 实体类
 * 用于封装从数据库查询出来的记录的。
 * 属性与表中字段一样
 * Created by EYlee on 7/22/15.
 */
public class Employee {
    private int id;
    private String LastName;
    private String FirstName;
    private String Address;
    private String City;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return id+","+LastName+","+FirstName+","+Address+","+City;
    }
}
