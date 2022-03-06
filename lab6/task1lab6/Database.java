package task1lab6;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boonjv
 */
import java.util.Vector;
package task1lab6;
/**
 *
 * @author boonjv
 */
public class Database {

    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<Employee>();
    }

    public void addEmployee(Employee employee) {
        boolean existed = false;
        // Code to add employee
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

    public void deleteEmployee(long emp_num) {
        // Code to delete employee
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNum() == emp_num) {
                employees.remove(i);
                break;
            }
        }
    }

    public Vector<Employee> getEmployees() {
        return employees;
    }
}
