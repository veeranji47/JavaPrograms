package com.numbers.patterns;

public class RightAngleTrianglePattern {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {//i=1 i=2   i=3     i=4
				System.out.print(j+" ");//j=1  j=1 2 j=1 2 3 j=1 2 3 4
				
			}
			System.out.println();
		}
	}

}
