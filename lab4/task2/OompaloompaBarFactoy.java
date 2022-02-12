
public class OompaloompaBarFactoy implements Factory {
    private int counter = 0;

    private volatile static OompaloompaBarFactoy uniqueInstance;

    private OompaloompaBarFactoy() {
    }

    public synchronized Bar create(int id) {
        Bar bar = new OompaloompaBar(counter++);
        System.out.println(id + " creates new Oompalompa bar created with id:" + counter);
        return bar;
    }

    public static synchronized OompaloompaBarFactoy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new OompaloompaBarFactoy();

        }
        return uniqueInstance;

    }
}
