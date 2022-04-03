public class Handler {
    private Handler successor;

    public void handleRequest() {
        successor.handleRequest();
    }
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
}
