import java.time.Year;

public class EatBreakfast {
	public static void main(String[] args) {
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.prepareEgg(2);


		Omelette omelette = new Omelette();
		omelette.prepareEgg(3);


		SunnySide sunny = new SunnySide();
		sunny.prepareEgg(1);
	}
}
