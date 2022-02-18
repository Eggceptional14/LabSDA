import java.util.LinkedList;
import java.util.List;

public class TestDatabase {
    public static void main(String[] args) {
        Database db = new Database();

        Records rec = new Records();
        Database recAdapter = new RecordsAdapter(rec);

        List<Database> dbs = new LinkedList<Database>();
        dbs.add(db);
        dbs.add(recAdapter);

        Employee e1 = new Employee("AName", "ASurname", 1111, 120000);
        Employee e2 = new Employee("BName", "BSurname", 2222, 240000);

        for (Database d : dbs) {
            d.addEmployee(e1);
            d.addEmployee(e2);
            d.printRecord();
        }
        System.out.println();
        for (Database d : dbs) {
            d.deleteEmployee(1111);
            d.printRecord();
        }
    }
}
