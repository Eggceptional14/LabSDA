package breakfast;

public class EatBreakfast {
	public static void main(String[] args) {
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.crackEggs(2);
		scrambled.stirEggs();
		scrambled.cook();
		scrambled.askCustomer();
		scrambled.serve();


		Omelette omelette = new Omelette();
		omelette.crackEggs(3);
		omelette.prepare();
		omelette.cook();
		omelette.askCustomer();
		omelette.serve();


		SunnySide sunny = new SunnySide();
		sunny.crackEggs(1);
		sunny.prepare();
		sunny.cook();
		sunny.askCustomer();
		sunny.serve();

	}

}