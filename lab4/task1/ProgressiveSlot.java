
public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;
	String type = "progressive";

	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}

	void build() {
		cabinet = componentFactory.createCabinet(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
		payment = componentFactory.createPayment(type);
		software = componentFactory.createOS(type);
	}
}
