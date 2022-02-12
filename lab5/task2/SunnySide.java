package breakfast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SunnySide extends EggCooking{

	public void crackEggs(int n) {
		System.out.println("Cracking " + n + " eggs.");
	}

	public void prepare() {
		System.out.println("Never stir sunny side up!");
	}

	public void cook() {
		System.out.println("Cooking the eggs sunny side up.");
	}

	public void stirEggs() {
	}

	public void addSpread() {
		System.out.println("Adding Salt and Pepper on top.");
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

