
public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new smallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
	public Payment createPayment() { return new Payment(); }
	public GPU createGPU() { return new GPU(); }
}
