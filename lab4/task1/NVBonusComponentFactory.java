public class NVBonusComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new SmallCabinet();
    }

    public Display createDisplay() {
        return new CRT();
    }

    public Payment createPayment() {
        return new Ticket();
    }

    public GPU createGPU() {
        return new X86();
    }

    public OS createOS() {
        return new Linux();
    }

}
