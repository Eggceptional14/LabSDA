
public class BallSilver extends TreeDecorator {

    public BallSilver(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Silver";
    }

    public double cost() {
        return 3 + tree.cost();
    }
}
