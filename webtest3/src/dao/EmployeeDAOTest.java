package dao;

import entity.Employee;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by EYlee on 7/22/15.
 */

public class EmployeeDAOTest {
    @Test
    public void testFindAll() throws Exception {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employees = dao.findAll();
        System.out.println(employees);
    }

    @Test
    public void testSave() throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        Employee e = new Employee();
        e.setId(199);
        e.setLastName("aaa");
        e.setLastName("bbb");
        e.setAddress("uuu");
        e.setCity("www");
        dao.save(e);
        System.out.println("save success");

    }

    @Test
    public void testDel() throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        dao.delete(1);
        System.out.println("save success");
    }

    @Test
    public void testFindByID() throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        Employee e =dao.findByID(2);
        System.out.println(e);
    }
    @Test
    public void testModify() throws SQLException {
        EmployeeDAO dao = new EmployeeDAO();
        Employee e = dao.findByID(2);
        e.setLastName("jdbc");
        dao.modify(e);
        System.out.println(e);
    }
}
