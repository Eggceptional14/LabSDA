
public class TestBabyMonitor {
	public static void main(String[] args) {
		Baby marla = new Baby("marla");
		// one monitor with one baby
		BabyMonitorSimple kitchen = new BabyMonitorSimple("kitchen ", marla);
		marla.setData(true, 1);
		// one monitor listening to two babies
		Baby charlie = new Baby("Charlie");
		BabyMonitorAdvanced livingroom = new BabyMonitorAdvanced("Living room ", marla, charlie);
		marla.setData(true, 2);
		charlie.setData(true, 1);
	}
}
