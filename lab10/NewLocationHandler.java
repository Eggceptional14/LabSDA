public class NewLocationHandler extends Handler {
    public NewLocationHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getType().equals("request")) {
            System.out.println("This is a request for new machines email.");
        }
        else {
            if (this.getSuccessor() != null) 
                this.getSuccessor().handleRequest(email);
        }
    }
}
