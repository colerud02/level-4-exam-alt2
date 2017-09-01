import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		word.toLowerCase();
		char[] array = word.toCharArray();
		char letter;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			letter = array[i];
			for (int j = 0; j < array.length; j++) {
				if (letter == array[j]) {
					num++;
					//break;
				}
			}
			return num;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				final String nextLine = scanner.nextLine();
				if (nextLine.trim().isEmpty()) break;
				
				System.out.println(duplicateCount(nextLine));
			}
		}
	}
}
