public interface DatabaseTarget {
    public void addEmployee(Employee emp);

    public void removeEmployee(long emp_num);

    public boolean isEmployee(long emp_num);

    public void printEmployees();

}
