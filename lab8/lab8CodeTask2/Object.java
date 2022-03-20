import java.util.ArrayList;
import java.util.Iterator;
public class Object extends Object_Component {
    private ArrayList<Object_Component> list = new ArrayList<Object_Component>();
    
    public Object() {}

    public void add(Object_Component object_component) {
        this.list.add(object_component);
    }

    @Override
    public void render() {
        Iterator iterator = this.list.iterator();
        if (iterator.hasNext()) {
            Object_Component comp = (Object_Component)iterator.next();
            comp.render();
        }
    }

    @Override
    public float volume() {
        float total_volume = 0;
        for (int i = 0; i < this.list.size(); i++) {
            
            Object_Component comp = (Object_Component)this.list.get(i);
            total_volume += comp.volume();
            System.out.println(i);
        }
        return total_volume;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(this.list.iterator());
    }
}