public class OompaloompaFactory implements Factory {
    private int counter=0;

    private volatile static OompalompaFactory uniqueInstance;

    private OompaloompaFactory() {}

    public synchronized Bar create(int id) {
        Bar bar = new OompalompaBar(counter++);
        System.out.println(id+ " creates new Oompalompa bar created with id:" + counter);
        return bar;
    }


    public static synchronized OompalompaFactory getInstance() {
        if (uniqueInstance==null) {
            synchronized ( OompalompaFactory.class){
                if(uniqueInstance == null) {
                    uniqueInstance = new OompalompaFactory}
            }
            return uniqueInstance;
        }
    }