import java.time.Year;

public class EatBreakfast {
	public static void main(String[] args) {
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.TemplateMethod(2);


		Omelette omelette = new Omelette();
		omelette.TemplateMethod(3);


		SunnySide sunny = new SunnySide();
		sunny.TemplateMethod(1);
	}

}
