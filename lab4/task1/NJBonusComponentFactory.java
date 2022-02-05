public class NJBonusComponentFactory implements SlotComponentFactory {

    public Cabinet createCabinet() {
        return new largeCabinet();
    }
    public Display createDisplay() {
        return new Reels();
    }
    public Payment createPayment() { return new Coin(); }
    public GPU createGPU() { return new ARM(); }
}
