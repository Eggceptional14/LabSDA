import java.util.ArrayList;
import java.util.Iterator;
public class Object extends Object_Component {
    private ArrayList<Object_Component> list = new ArrayList<Object_Component>();
    private float o_volume ;
    
    public void add(Object_Component object_component) {
        this.list.add(object_component);
        this.o_volume += list.volume();

    }

    @Override
    public void render() {
        Iterator iterator = list.iterator();
        for(Object_Component objectComp : list )
            ((Object_Component) iterator.next()).render();
    }

    @Override
    public float volume() {
        return this.o_volume;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(this.list.iterator());
    }
}