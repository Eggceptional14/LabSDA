
public class WSSlotStore extends SlotStore {
    protected Slot makeSlot(slottype type) {
        if (type.equals(slottype.progressive)) return new WSSlotProgressive();
        else if (type.equals(slottype.straight)) return new WSSlotStraight();
        else if (type.equals(slottype.bonus)) return new WSSlotBonus();
        else return null;
    }
}
