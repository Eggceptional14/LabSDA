public class StraightSlot extends Slot {
    SlotComponentFactory componentFactory;

    public StraightSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    void build() {
        cabinet = componentFactory.createCabinet();
        display = componentFactory.createDisplay();
        gpu = componentFactory.createGPU();
        payment = componentFactory.createPayment();
        software = componentFactory.createOS();

    }
}
