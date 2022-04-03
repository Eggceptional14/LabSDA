public class CatchAllHandler extends Handler{
    public CatchAllHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Email email) {
        System.out.println("Unidentified type email.");
        
    }
}
