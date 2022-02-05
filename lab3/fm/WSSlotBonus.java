public class WSSlotBonus extends Slot {
    public WSSlotBonus() {
        name = "Bonus";
        software = "Symbian";
        components.add("Medium");
        components.add("ticketinticketout");
        components.add("VGA");
        components.add("ARM");
    }

    void ship() {
        System.out.println("having uncle vinnie drop it off");
    }
}
