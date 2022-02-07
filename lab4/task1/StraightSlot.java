public class StraightSlot extends Slot {
    SlotComponentFactory componentFactory;
    String type = "straight";

    public StraightSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    void build() {
        cabinet = componentFactory.createCabinet(type);
        display = componentFactory.createDisplay(type);
        gpu = componentFactory.createGPU(type);
        payment = componentFactory.createPayment(type);
        software = componentFactory.createOS(type);

    }
}
