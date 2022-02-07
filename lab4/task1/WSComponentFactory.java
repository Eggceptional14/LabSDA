
public class WSComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet(String type) {
        switch (type) {
            case "straight":
                return new LargeCabinet();
            case "bonus":
                return new MediumCabinet();
            case "progressive":
                return new LargeCabinet();
            default:
                return null;
        }
    }

    public Display createDisplay(String type) {
        switch (type) {
            case "straight":
                return new Reels();
            case "bonus":
                return new VGA();
            case "progressive":
                return new Reels();
            default:
                return null;
        }
    }

    public Payment createPayment(String type) {
        switch (type) {
            case "straight":
                return new Bill();
            case "bonus":
                return new Ticket();
            case "progressive":
                return new Coin();
            default:
                return null;
        }
    }

    public GPU createGPU(String type) {
        switch (type) {
            case "straight":
                return new ARM();
            case "bonus":
                return new ARM();
            case "progressive":
                return new ARM();
            default:
                return null;
        }
    }

    public OS createOS(String type) {
        switch (type) {
            case "straight":
                return new Linux();
            case "bonus":
                return new Symbian();
            case "progressive":
                return new Android();
            default:
                return null;
        }
    }

}
