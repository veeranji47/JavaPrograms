package patterns.alphabets;

import java.util.Scanner;

public class Pattern2 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the name
	        System.out.print("Enter a name: ");
	        String name = scanner.nextLine();

	        // Extract only alphabets from the name
	        StringBuilder alphabets = new StringBuilder();
	        for (int i = 0; i < name.length(); i++) {
	            char ch = name.charAt(i);
	            if (Character.isLetter(ch)) {
	                alphabets.append(ch);
	            }
	        }

	        System.out.println("Extracted Alphabets: " + alphabets);

	        // Generate a pattern from the extracted alphabets
	        System.out.println("Generated Pattern:");
	        for (int i = 0; i < alphabets.length(); i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(alphabets.charAt(j) + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }

}
