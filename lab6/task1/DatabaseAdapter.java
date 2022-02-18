public class DatabaseAdapter extends Records {
    Database database;

    public void insert(Employee employee) {
        // Code to insert employee
        database.addEmployee(employee);
    }

    public void remove(long emp_num) {
        // Code to remove employee
        database.deleteEmployee(emp_num);
    }

    public void printRecord() {
        for (int i = 0; i < employees.size(); i++) {
            Employee temp = employees.get(i);
            System.out.println(String.valueOf(temp.getEmpNum()) + " " + temp.getName() + " " + temp.getSurname() + " " +
                    String.valueOf(temp.getSalary()));
        }
    }
}
