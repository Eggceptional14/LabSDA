public class FanHandler extends Handler{

    public FanHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getType().equals("fan")) {
            System.out.println("This is a fan email.");
        }
        else {
            if (this.getSuccessor() != null) 
                this.getSuccessor().handleRequest(email);
        }
    }
}
