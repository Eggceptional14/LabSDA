public class RecordsAdapter extends Database {
    private Records records;

    public RecordsAdapter(Records records) {
        this.records = records;
    }

    public void addEmployee(Employee employee) {
        // Code to insert employee
        this.records.insert(employee);
    }

    public void deleteEmployee(long emp_num) {
        // Code to remove employee
        records.remove(emp_num);
    }

    public boolean isEmployee(long emp_num) {
        // Code to find employee
        return records.isEmployee(emp_num);
    }

    public void printRecord() {
        for (int i = 0; i < employees.size(); i++) {
            Employee temp = employees.get(i);
            System.out.println(String.valueOf(temp.getEmpNum()) + " " + temp.getName() + " " + temp.getSurname() + " " +
                    String.valueOf(temp.getSalary()));
        }
    }
}
