import java.io.File;
import java.util.Scanner;

public class Sheep {

	public static int countSheep(String s) {
		String comparable = "";
		int sheepCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				comparable += s.charAt(i);
			}
			if (!s.contains(" ") && i == s.length() - 1) {
				if (comparable.equals("sheep")) {
					sheepCount++;
					comparable = ""; // reset
				}
			} else {
				if (comparable.equals("sheep") && i < s.length() - 1 && s.charAt(i + 1) == ' ') {
					sheepCount++;
					comparable = ""; // reset
				}
			}
		}
		return sheepCount;
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("Sheep.txt"));
			System.out.println(s.nextInt());
			for (int i = 0; i < s.nextInt(); i++) {
				
			}
		} catch (Exception e) {
			System.out.println("File not found.");
		}
	}
}
