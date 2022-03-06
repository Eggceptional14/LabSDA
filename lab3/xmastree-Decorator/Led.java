
public class Led extends TreeDecorator {

    public Led(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", LEDs";
    }

    public double cost() {
        return 10 + tree.cost();
    }
}
