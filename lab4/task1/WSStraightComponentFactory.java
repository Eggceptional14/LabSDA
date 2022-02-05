
public class WSStraightComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new largeCabinet();
    }
    public Display createDisplay() {
        return new Reels();
    }
    public Payment createPayment() { return new Bill(); }
    public GPU createGPU() { return new ARM(); }
}
