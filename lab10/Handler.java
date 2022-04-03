public class Handler {
    private Handler successor;

    public Handler( Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Email email) {
        if ( this.successor != null) {
            successor.handleRequest(email);
        }
    }
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
}
