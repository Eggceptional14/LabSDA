
public class NVStraightComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new LargeCabinet();
	}

	public Display createDisplay() {
		return new Reels();
	}

	public Payment createPayment() {
		return new Ticket();
	}

	public GPU createGPU() {
		return new ARM();
	}

	public OS createOS() {
		return new Linux();
	}

}
