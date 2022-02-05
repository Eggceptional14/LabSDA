
public class NVSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new largeCabinet();
	}
	public Display createDisplay() {
		return new LCD();
	}
	public Payment createPayment() { return new Payment(); }
	public GPU createGPU() { return new GPU(); }
}
