public class DatabaseAdapter extends Records implements Target {
    Database database;

    public DatabaseAdapter(Database db) {
        this.database = db;
    }

    public void addEmployee(Employee employee) {
        // Code to insert employee
        database.addEmployee(employee);
    }

    public void removeEmployee(long emp_num) {
        // Code to remove employee
        database.deleteEmployee(emp_num);
    }

    public boolean isEmployee(long emp_num) {
        // Code to find employee
        for (int i = 0; i < this.database.getEmployees().size(); i++) {
            if (this.database.getEmployees().get(i).getEmpNum() == emp_num) {
                return true;
            }
        }
        return false;
    }

    public void printEmployees() {
        for (int i = 0; i < this.database.getEmployees().size(); i++) {
            Employee temp = this.database.getEmployees().get(i);
            System.out.println(String.valueOf(temp.getEmpNum()) + " " + temp.getName() +
                    " " + temp.getSurname() + " " + String.valueOf(temp.getSalary()));
        }
    }
}
