
public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WSStore = new WESlotStore();

		Slot slot = NVStore.orderSlot(slottype.progressive);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
		slot = NJStore.orderSlot(slottype.progressive);
		System.out.println("Borgata ordered a "+ slot.getName());
		slot = WSStore.orderSlot(slottype.progressive);
		System.out.println("Somchai ordered a "+ slot.getName());

	}

}
