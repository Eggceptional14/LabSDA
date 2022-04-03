public class ComplaintHandler extends Handler {

    public ComplaintHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getType().equals("complaint")) {
            System.out.println("This is a complaint email.");
        }
        else {
            if (this.getSuccessor() != null) 
                this.getSuccessor().handleRequest(email);
        }
    }
}
