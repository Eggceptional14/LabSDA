public class WSSlotFactory extends SlotFactory {
    protected Slot makeSlot(String item) {
        Slot slot = null;
        SlotComponentFactory componentFactory = null;
        if (item.equals("bonus")) {
            componentFactory = new WSBonusComponentFactory();
            slot = new BonusSlot(componentFactory);
            slot.setName("Washington Style Bonus Slot");
        } else if (item.equals("progressive")) {
            slot = new ProgressiveSlot(componentFactory);
            componentFactory = new WSProgressiveComponentFactory();
            slot.setName("Washington Style Progressive Slot");
        } else if (item.equals("straight")) {
            slot = new StraightSlot(componentFactory);
            componentFactory = new WSStraightComponentFactory();
            slot.setName("Washington Style Straight Slot");
        }
        return slot;
    }
}
