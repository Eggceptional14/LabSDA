
public class NVSlotFactory extends SlotFactory {

	protected Slot makeSlot(String item) {
		Slot slot = null;
		SlotComponentFactory componentFactory = null;
		if (item.equals("bonus")) {
			componentFactory = new NVComponentFactory();
			slot = new BonusSlot(componentFactory);
			slot.setName("Nevada Style Bonus Slot");
		} else if (item.equals("progressive")) {
			componentFactory = new NVComponentFactory();
			slot = new ProgressiveSlot(componentFactory);
			slot.setName("Nevada Style Progressive Slot");
		} else if (item.equals("straight")) {
			componentFactory = new NVComponentFactory();
			slot = new StraightSlot(componentFactory);
			slot.setName("Nevada Style Straight Slot");
		}
		return slot;
	}
}