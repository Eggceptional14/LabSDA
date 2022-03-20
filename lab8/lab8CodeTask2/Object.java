import java.util.ArrayList;
import java.util.Iterator;
public class Object extends Object_Component {
    private ArrayList<Object_Component> list = new ArrayList<Object_Component>();

    public void add(Object_Component object_component) {
        this.list.add(object_component);
    }

    @Override
    public void render() {
        System.out.println("Hello");
    }

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(this.list.iterator());
    }
}