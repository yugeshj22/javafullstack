package com.tns.arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		
		        int[][] jagged = new int[3][];

		        // Define each row with different lengths
		        jagged[0] = new int[] {1, 2};             // Row 0 has 2 elements
		        jagged[1] = new int[] {3, 4, 5};          // Row 1 has 3 elements
		        jagged[2] = new int[] {6, 7, 8, 9};       // Row 2 has 4 elements

		        // Display the jagged array
		        System.out.println("Jagged Array Contents:");
		        for (int i = 0; i < jagged.length; i++) {
		            for (int j = 0; j < jagged[i].length; j++) {
		                System.out.print(jagged[i][j] + " ");
		            }
		            System.out.println(); // Move to next row
		        }
		    
		
	}

}
