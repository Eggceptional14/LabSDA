public class NVProgressiveComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new MediumCabinet();
    }

    public Display createDisplay() {
        return new LCD();
    }

    public Payment createPayment() {
        return new Ticket();
    }

    public GPU createGPU() {
        return new X77();
    }

    public OS createOS() {
        return new Android();
    }

}
