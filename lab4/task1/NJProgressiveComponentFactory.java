public class NJProgressiveComponentFactory implements SlotComponentFactory {

    public Cabinet createCabinet() {
        return new smallCabinet();
    }

    public Display createDisplay() {
        return new CRT();
    }

    public Payment createPayment() {
        return new Bill();
    }

    public GPU createGPU() {
        return new X86();
    }

    public OS createOS() {
        return new WindowXP();
    }

}