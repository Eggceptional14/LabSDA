import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{
    private Iterator menuItemsIterator;

    public PancakeHouseMenuIterator( ArrayList<MenuItem> menuItems ){
        menuItemsIterator = menuItems.iterator();
    }

    public boolean hasNext() {
        return this.menuItemsIterator.hasNext();
    }

    public MenuItem next() {
        return (MenuItem) this.menuItemsIterator.next();
    }
    
}
