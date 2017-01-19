import java.io.File;
import java.util.Scanner;

public class Sheep {

	public static int countSheep(String input, Scanner s) {
		String comparable = "";
		int sheepCount = 0;

		while (s.hasNext()) {
			comparable = s.next();
			if (comparable.equalsIgnoreCase(input)) {
				sheepCount++;
			}
		}
		return sheepCount;
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("Sheep.txt"));
			Scanner r = new Scanner(System.in);
			String input = "";

			System.out.println("Input a word to find the number of recurrences.");
		  input = r.nextLine();

			System.out.println("Occurences of " + input + ": " + countSheep(input, s));

		} catch (Exception e) {
			System.out.println("File not found.");
		}
	}
}
