 


import java.util.*;


// Value object.
//
public class TableMemento implements java.io.Serializable {

    private List columnIdentifiers;
    private List dataList;

    // Package visibility to only allow access for
    // the Originator.
    // We receive from the TableModel:
    // - a Vector of column identifiers
    // - a Vector of Vectors of Object values (assumption: Strings)

    TableMemento(Vector columnIdentifiers, Vector dataVector)
    {
	// COMPLETE.
        this.columnIdentifiers = (List)columnIdentifiers;
        this.dataList =(List)dataVector;

    }

    // Package visibility to only allow access for
    // the Originator.
    Vector getColumnIdentifiers()
    {
	// COMPLETE.
        return (Vector)columnIdentifiers;

    }

    Vector getDataVector()
    {
	// COMPLETE.
        return (Vector)dataList;



    }

    public String toString() {
	return "[ci=" + columnIdentifiers.toString() + "\n" +
	    "dl=" + dataList.toString() + "]";
    }

    // Other private (static) helper methods.
    // COMPLETE if necessary.

}
