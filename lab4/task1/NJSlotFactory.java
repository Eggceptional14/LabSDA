
public class NJSlotFactory extends SlotFactory {

	protected Slot makeSlot(String item) {
		Slot slot = null;
		SlotComponentFactory componentFactory = null;
		if (item.equals("bonus")) {
			componentFactory = new NJComponentFactory();
			slot = new BonusSlot(componentFactory);
			slot.setName("New Jersey Style Bonus Slot");
		} else if (item.equals("progressive")) {
			componentFactory = new NJComponentFactory();
			slot = new ProgressiveSlot(componentFactory);
			slot.setName("New Jersey Style Progressive Slot");
		} else if (item.equals("straight")) {
			componentFactory = new NJComponentFactory();
			slot = new StraightSlot(componentFactory);
			slot.setName("New Jersey Style Straight Slot");
		}
		return slot;
	}
}