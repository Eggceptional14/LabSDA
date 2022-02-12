
public abstract class EggCooking {
    void TemplateMethod() {
        int eggNum=0;
        crackEggs(eggNum);
        stirEggs();
        prepare();
        cook();
        serve();

        if (askCustomer()) {
            addSpread(); 
        }
    }

    abstract void crackEggs(int eggNum);
    abstract void stirEggs();
    abstract void cook();
    abstract void prepare();
    abstract void addSpread();
    boolean askCustomer() {
        return true;
    }
    void serve() {
        System.out.println("Putting the eggs on the plate");
    }



}
