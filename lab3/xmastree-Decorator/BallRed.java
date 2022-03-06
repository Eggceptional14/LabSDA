
public class BallRed extends TreeDecorator {

    public BallRed(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Red";
    }

    public double cost() {
        return 1 + tree.cost();
    }
}
