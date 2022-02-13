
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Character;

public class Omelette extends EggCooking {

	public void crackEggs(int omlEggNum) {
		System.out.println("Cracking " + omlEggNum + " eggs");
	}

	public void cook() {
		System.out.println("Flipping the omelette while cooking");
	}

	public void prepare() {
		System.out.println("Stirring the eggs");
	}

	public void addSpread() {
		System.out.println("Adding Salt and Pepper");
	}

	public void stirEggs() {
	}

	public boolean askCustomer() {
		char ans;
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to spread salt and pepper on your omelette (y/n)? ");
		ans = sc.next().charAt(0);
		
		ans = Character.toLowerCase(ans);
		// sc.close();
		return ans == 'y';
	}
}
