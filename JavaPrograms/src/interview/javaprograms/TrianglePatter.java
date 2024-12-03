package interview.javaprograms;

import java.util.HashMap;

public class TrianglePatter {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				
					System.out.print("  ");
				}
			for(int k = 1; k <= i;k++) {
//				if(k%2 == 0)
//					System.out.print("  ");
//				else
					System.out.print("*   ");
			}
			System.out.println();
		
//		  for (int i = 1; i <= n; i++) { // Loop for rows
//	            // Print spaces
//	            for (int j = i; j < n; j++) {
//	                System.out.print("  "); // Two spaces
//	            }
//	            // Print stars with spaces
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*   "); // Star followed by three spaces
//	            }
//	            System.out.println(); // Move to the next row
//	        
		}
	}
}
