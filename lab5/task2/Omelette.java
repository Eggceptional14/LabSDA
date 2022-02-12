package breakfast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Omelette extends EggCooking {

	public void crackEggs(int omlEggNum) {
		System.out.println("Cracking " + omlEggNum + "eggs");
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
		int ans;
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to spread salt and pepper on top (y/n)? ");
		ans = sc.nextInt();

		if (ans == 121) {
			return true;
		} else if (ans == 110) {
			return false;
		} else {
			return false;
		}
	}
}
