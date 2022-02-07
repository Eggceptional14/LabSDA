
public class BonusSlot extends Slot {
	SlotComponentFactory componentFactory;
	String type = "bonus";

	public BonusSlot(SlotComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}

	void build() {
		System.out.println("Building " + name);
		cabinet = componentFactory.createCabinet(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
		payment = componentFactory.createPayment(type);
		software = componentFactory.createOS(type);

	}
}
