package arrays;

import java.lang.reflect.Array;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] typesOfStrings = {"Thread", "Twine", "Yarn", "Rope", "Cable"};
		int[] thicknesses = {0, 1, 2, 3, 4};
		//2. print the third element in the array
	System.out.println(typesOfStrings[2]);
		//3. set the third element to a different value
	typesOfStrings[2] = "New Third";
		//4. print the third element again
	System.out.println(typesOfStrings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	for(int i = 0; i<Array.getLength(typesOfStrings); i++) {
		System.out.println(typesOfStrings[i]);
	}
		
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
