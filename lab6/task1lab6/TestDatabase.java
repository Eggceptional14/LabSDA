package task1lab6;import java.util.LinkedList;
import java.util.List;
package task1lab6;

public class TestDatabase {
    public static void main(String[] args) {

        Records rec = new Records();
        Database db2 = new Database();

        List<DatabaseTarget> allContainer = new LinkedList<DatabaseTarget>();
        allContainer.add(new RecordsAdapter(rec));
        allContainer.add(new DatabaseAdapter(db2));

        Employee e1 = new Employee("AName", "ASurname", 1111, 120000);
        Employee e2 = new Employee("BName", "BSurname", 2222, 240000);

        for (DatabaseTarget d : allContainer) {
            d.addEmployee(e1);
            d.addEmployee(e2);
            d.printEmployees();
            System.out.println(d.isEmployee(1111));
        }
        System.out.println();
        for (DatabaseTarget d : allContainer) {
            d.removeEmployee(1111);
            d.printEmployees();
            System.out.println(d.isEmployee(1111));

        }
    }
}
