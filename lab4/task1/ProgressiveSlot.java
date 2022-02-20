package task1;

public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;

	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}

	void build(String type) {
		cabinet = componentFactory.createCabinet(type);
		display = componentFactory.createDisplay(type);
		gpu = componentFactory.createGPU(type);
		payment = componentFactory.createPayment(type);
		software = componentFactory.createOS(type);
	}
}
