public class NVComponentFactory implements SlotComponentFactory {

    public Cabinet createCabinet(String type) {
        switch (type) {
            case "straight":
                return new LargeCabinet();
            case "bonus":
                return new SmallCabinet();
            case "progressive":
                return new MediumCabinet();
            default:
                return null;
        }
    }

    public Display createDisplay(String type) {
        switch (type) {
            case "straight":
                return new Reels();
            case "bonus":
                return new CRT();
            case "progressive":
                return new LCD();
            default:
                return null;
        }
    }

    public Payment createPayment(String type) {
        switch (type) {
            case "straight":
                return new Ticket();
            case "bonus":
                return new Ticket();
            case "progressive":
                return new Ticket();
            default:
                return null;
        }
    }

    public GPU createGPU(String type) {
        switch (type) {
            case "straight":
                return new ARM();
            case "bonus":
                return new X86();
            case "progressive":
                return new X77();
            default:
                return null;
        }
    }

    public OS createOS(String type) {
        switch (type) {
            case "straight":
                return new Linux();
            case "bonus":
                return new Linux();
            case "progressive":
                return new Android();
            default:
                return null;
        }
    }

}
