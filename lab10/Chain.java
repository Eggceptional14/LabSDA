public class Chain {
    Handler chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new SpamHandler(new FanHandler(new ComplaintHandler(new NewLocationHandler(new CatchAllHandler(null)))));
    }
    
    public void process( Email email ){
        chain.handleRequest(email);
    }
}

