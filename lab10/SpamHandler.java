public class SpamHandler extends Handler{
    
    private Email email;

    public SpamHandler(Email email) {
        this.email = email;
    }

    @Override
    public void handleRequest() {
        if (this.email.getType().equals("spam")) {
            System.out.println("This is a spam email.");
        }
        else {
            this.getSuccessor().handleRequest();
        }
    }
}
