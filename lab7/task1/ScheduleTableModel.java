
import javax.swing.*;
import javax.swing.table.*;
import java.util.Vector;
import java.util.List;

public class ScheduleTableModel extends DefaultTableModel {

    // DefaultTableModel uses:
    // - a Vector of column identifiers
    // - a Vector of Vectors of Object values
    // This fact is reflected by the Memento class.
    public static class Memento implements java.io.Serializable {

        private List columnIdentifiers;
        private List dataList;
        // Package visibility to only allow access for
        // the Originator.
        // We receive from the TableModel:
        // - a Vector of column identifiers
        // - a Vector of Vectors of Object values (assumption: Strings)

        Memento(Vector columnIdentifiers, Vector dataVector) {
            // COMPLETE.
            this.columnIdentifiers = (List) columnIdentifiers;
            this.dataList = (List) dataVector;
        }

        // Package visibility to only allow access for
        // the Originator.
        Vector getColumnIdentifiers() {
            // COMPLETE.
            return (Vector) columnIdentifiers;

        }

        Vector getDataVector() {
            // COMPLETE.
            return (Vector) dataList;

        }

        public String toString() {
            return "[ci=" + columnIdentifiers.toString() + "\n" +
                    "dl=" + dataList.toString() + "]";
        }

        // Other private (static) helper methods.
        // COMPLETE if necessary.

    }

    public ScheduleTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    public Memento createMemento() {
        // COMPLETE.
        int numberOfCols = getColumnCount();
        Vector colIdentifiers = new Vector(numberOfCols);
        for (int i = 0; i < numberOfCols; i++) {
            colIdentifiers.add(getColumnName(i));
        }

        return new Memento(columnIdentifiers, getDataVector());

    }

    public void setMemento(Memento memento) {
        // COMPLETE.
        setDataVector(memento.getDataVector(), memento.getColumnIdentifiers());

    }
}
