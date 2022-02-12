import java.time.Year;

public class EatBreakfast {
	public static void main(String[] args) {
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.crackEggs(2);
		scrambled.stirEggs();
		scrambled.cook();
		scrambled.serve();
		if (scrambled.askCustomer()) {
            scrambled.addSpread(); 
        }


		Omelette omelette = new Omelette();
		omelette.crackEggs(3);
		omelette.prepare();
		omelette.cook();
		omelette.serve();
		if (omelette.askCustomer()) {
            omelette.addSpread(); 
        }



		SunnySide sunny = new SunnySide();
		sunny.crackEggs(1);
		sunny.prepare();
		sunny.cook();
		sunny.serve();
		if (sunny.askCustomer()) {
            sunny.addSpread(); 
        }


	}

}
