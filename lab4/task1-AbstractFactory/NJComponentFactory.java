package task1;

public class NJComponentFactory implements SlotComponentFactory {

    public Cabinet createCabinet(String type) {
        switch (type) {
            case "straight":
                return new SmallCabinet();
            case "bonus":
                return new LargeCabinet();
            case "progressive":
                return new SmallCabinet();
            default:
                return null;
        }
    }

    public Display createDisplay(String type) {
        switch (type) {
            case "straight":
                return new LCD();
            case "bonus":
                return new Reels();
            case "progressive":
                return new CRT();
            default:
                return null;
        }
    }

    public Payment createPayment(String type) {
        switch (type) {
            case "straight":
                return new Coin();
            case "bonus":
                return new Coin();
            case "progressive":
                return new Bill();
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
                return new X86();
            default:
                return null;
        }
    }

    public OS createOS(String type) {
        switch (type) {
            case "straight":
                return new WindowME();
            case "bonus":
                return new WindowME();
            case "progressive":
                return new WindowXP();
            default:
                return null;
        }
    }

}
