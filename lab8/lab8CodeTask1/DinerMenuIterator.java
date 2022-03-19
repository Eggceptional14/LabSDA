import java.util.*;

public class DinerMenuIterator implements Iterator<MenuItem>{
    private MenuItem[] menuItems;
    private int curIndex;

    public DinerMenuIterator(MenuItem[] menuItems ) {
        this.menuItems = menuItems;
        this.curIndex = 0;
    }

    public boolean hasNext() {
        return curIndex >= 0 && curIndex < this.menuItems.length - 1;
    }

    public MenuItem next() {
        if (this.hasNext()) {
            this.curIndex++;
            return this.menuItems[this.curIndex];
        }
        else {
            return null;
        }
    }
}
