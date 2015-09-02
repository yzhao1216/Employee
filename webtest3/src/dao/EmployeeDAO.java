package dao;

import entity.Employee;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//junit 单元测试 白盒测试：开发人员自己测试某方法是否有问题

/**
 * Created by EYlee on 7/22/15.
 */
public class EmployeeDAO {

    public List<Employee> findAll() throws Exception {
        List<Employee> employees = new ArrayList<Employee>();
        Connection con = null;

        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Persons");
            ResultSet re = ps.executeQuery();
            while (re.next()) {
                int id = re.getInt("Id_P");
                String LastName = re.getString("LastName");
                String FirstName = re.getString("FirstName");
                String Address = re.getString("Address");
                String City = re.getString("City");
                Employee e = new Employee();
                e.setId(id);
                e.setLastName(LastName);
                e.setFirstName(FirstName);
                e.setAddress(Address);
                e.setCity(City);
                employees.add(e);

            }

        } catch (SQLException e) {

            e.printStackTrace();
            throw e;
        } finally {
            DBUtil.close(con);
        }


        return employees;
    }

    public void save(Employee e) throws SQLException {
        Connection con = null;

        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Persons(Id_P,LastName,FirstName,Address,City)" +
                    "VALUES (?,?,?,?,?) ");
            ps.setInt(1, e.getId());
            ps.setString(2, e.getLastName());
            ps.setString(3, e.getFirstName());
            ps.setString(4, e.getAddress());
            ps.setString(5, e.getCity());
            ps.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
            throw e1;
        } finally {
            DBUtil.close(con);
        }


    }

    public void delete(int id) throws SQLException {
        Connection con = null;

        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Persons WHERE Id_P=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            DBUtil.close(con);
        }

    }

    public Employee findByID(int anid) throws SQLException {

        Connection con = null;
        Employee e = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Persons WHERE Id_P=?");
            ps.setInt(1, anid);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                int id = res.getInt("Id_P");
                String LastName = res.getString("LastName");
                String FirstName = res.getString("FirstName");
                String Address = res.getString("Address");
                String City = res.getString("City");
                e = new Employee();
                e.setId(id);
                e.setLastName(LastName);
                e.setFirstName(FirstName);
                e.setAddress(Address);
                e.setCity(City);
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
            throw e1;
        } finally {
            DBUtil.close(con);
        }

        return e;

    }

    public void modify(Employee e) throws SQLException {
        Connection con = null;

        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE Persons SET LastName=?,FirstName=?,Address=?,City=? WHERE Id_P=?");
            ps.setString(1, e.getLastName());
            ps.setString(2, e.getFirstName());
            ps.setString(3, e.getAddress());
            ps.setString(4, e.getCity());
            ps.setInt(5, e.getId());
            ps.executeUpdate();

        } catch (SQLException e1) {
            e1.printStackTrace();
            throw e1;
        } finally {
            DBUtil.close(con);
        }
    }


}
