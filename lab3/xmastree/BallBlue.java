public class BallBlue extends TreeDecorator {

    public BallBlue(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Blue";
    }

    public double cost() {
        return 2 + tree.cost();
    }
}
