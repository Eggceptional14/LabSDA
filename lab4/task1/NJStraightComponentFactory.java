
public class NJStraightComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new smallCabinet();
	}
	public Display createDisplay() {
		return new LCD();
	}
	public Payment createPayment() { return new Coin(); }
	public GPU createGPU() { return new ARM(); }
}
