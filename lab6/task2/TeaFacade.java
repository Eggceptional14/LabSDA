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
        blueCup.addWater(water);
        blueCup.setSteepTime(15);
        blueCup.steep();
    }
}
