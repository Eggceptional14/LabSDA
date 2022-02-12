public class SingletonfactoryTest {
	public static void main(String[] args) {
		BarProducer t1 = new BarProducer(1, "wonka");
		BarProducer t2 = new BarProducer(2, "oompaloompa");
		BarProducer t3 = new BarProducer(3, "wonka");
		BarProducer t4 = new BarProducer(4, "oompaloompa");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		 t1.interrupt();
		 t1.interrupt();
	}
}
