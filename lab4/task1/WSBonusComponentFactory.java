
public class WSBonusComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new MediumCabinet();
    }

    public Display createDisplay() {
        return new VGA();
    }

    public Payment createPayment() {
        return new Ticket();
    }

    public GPU createGPU() {
        return new ARM();
    }

    public OS createOS() {
        return new Symbian();
    }
}
