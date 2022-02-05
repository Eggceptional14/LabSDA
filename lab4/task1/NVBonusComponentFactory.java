public class NVBonusComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new smallCabinet();
    }
    public Display createDisplay() {
        return new CRT();
    }
    public Payment createPayment() { return new Ticket(); }
    public GPU createGPU() { return new X86(); }
}
