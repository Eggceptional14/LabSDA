public class OompaloompaFactory implements Factory {
    private int counter = 0;

    private volatile static OompaloompaFactory uniqueInstance;

    private OompaloompaFactory() {
    }

    public synchronized Bar create(int id) {
        Bar bar = new OompaloompaBar(counter++);
        System.out.println(id + " creates new Oompalompa bar created with id:" + counter);
        return bar;
    }

    public static synchronized OompaloompaFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new OompaloompaFactory();

        }
        return uniqueInstance;

    }
}