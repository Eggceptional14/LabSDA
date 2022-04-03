public class Test {
    public static void main( String [] args ) {
        Chain chain = new Chain();

        chain.process(new Email("fan"));
        chain.process(new Email("spam"));
        chain.process(new Email("request"));
        chain.process(new Email("complaint"));
        chain.process(new Email("advertisement"));
    }
}
