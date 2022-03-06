public class NVSlotBonus extends Slot {
    public NVSlotBonus() {
        name = "Bonus";
        software = "Linux";
        components.add("Small");
        components.add("ticketinticketout");
        components.add("CRT");
        components.add("X86");
    }

    void ship() {
        System.out.println("having uncle vinnie drop it off");
    }
}
