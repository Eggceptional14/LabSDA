
public class BarProducer extends Thread {
	Factory wonka;
	public int count = 0; // each producer creates 50 bars
	public int id;
	public String barType;

	public BarProducer(int identifier, String type) {
		id = identifier;
		barType = type;
		System.out.println("creating new Bar Producer with ID:" + id);
	}

	public void run() {
		while (count < 10) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
			count++;
			// System.out.println(id+":running");
			if (barType == "wonka") {
				WonkaBarFactory.getInstance().create(id);
			} else if (barType == "oompaloompa") {
				OompaloompaFactory.getInstance().create(id);
			}
		}
	}
}