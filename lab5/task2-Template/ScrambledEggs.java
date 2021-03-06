
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScrambledEggs extends EggCooking {

	public void crackEggs(int num) {
		System.out.println("Cracking " + num + " eggs");
	}

	public void stirEggs() {
		System.out.println("Stirring and adding milk to the eggs");
	}

	public void cook() {
		System.out.println("Scrambling the eggs.");
	}

	public void prepare() {
	}

	public void addSpread() {
		System.out.println("Adding Salt and Pepper");
	}

	public boolean askCustomer() {
		String ans;
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to spread salt and pepper on your scramble eggs (y/n)? ");
		ans = sc.nextLine();
		return ans.toLowerCase().equals("y");
	}
}
