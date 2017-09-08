import java.util.Arrays;
import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		word.toLowerCase();
		char[] array = word.toCharArray();
		char letter;
		int num = 0;
		int final1 = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			letter = array[i];
			num = 0;
			for (int j = i+1; j < array.length; j++) {
				if (letter == array[j] && letter != ' ') {
					num++;
					array[j] = ' ';
				}
				
			}
			if (num >0) {
				final1+= 1;
			}
			
		}
		return final1;
		
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
