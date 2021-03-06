public class SpamHandler extends Handler{

    public SpamHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getType().equals("spam")) {
            System.out.println("This is a spam email.");
        }
        else {
            if (this.getSuccessor() != null) 
                this.getSuccessor().handleRequest(email);
        }
    }
}
