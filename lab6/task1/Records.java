
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author boonjv
 */
import java.util.ArrayList;

public class Records {

    private ArrayList<Employee> employees; // Stores the employees

    public Records() {
        employees = new ArrayList<Employee>();
    }

    public void insert(Employee employee) {
        // Code to insert employee
        boolean existed = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNum() == employee.getEmpNum()) {
                employees.remove(i);
                existed = true;
                break;
            }
        }
        if (existed) {
            System.out.println("Employee is already existed.");
        } else {
            employees.add(employee);
        }
    }

    public void remove(long emp_num) {
        // Code to remove employee
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNum() == emp_num) {
                employees.remove(i);
                break;
            }
        }
    }

    public boolean isEmployee(long emp_num) {
        // Code to find employee
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNum() == emp_num) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

}
