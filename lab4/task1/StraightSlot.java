public class StraightSlot extends Slot {
    SlotComponentFactory componentFactory;

    public StraightSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    void build(String type) {
        cabinet = componentFactory.createCabinet(type);
        display = componentFactory.createDisplay(type);
        gpu = componentFactory.createGPU(type);
        payment = componentFactory.createPayment(type);
        software = componentFactory.createOS(type);

    }
}
