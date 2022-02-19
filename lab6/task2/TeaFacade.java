package task2;

public class TeaFacade {

    TeaCup cup;
    Water water;
    TeaInfuser infuser;

    public TeaFacade(TeaCup cup, Water water, TeaInfuser infuser) {
        this.cup = cup;
        this.water = water;
        this.infuser = infuser;
    }

    public void makeTea(String teaType) {
        Tea tea = new Tea(teaType);
        infuser.addTea(tea);
        water.boilWater();
        cup.addWater(water);
        cup.setSteepTime(15);
        cup.steep();
    }
}
