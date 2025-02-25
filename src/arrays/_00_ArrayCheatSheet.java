package arrays;

import java.lang.reflect.Array;
import java.util.Random;

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
	   int[] numnumnum = new int [50];
	   Random itsSoRandom = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<50; i++) {
			numnumnum[i] = itsSoRandom.nextInt(50);
			//System.out.println(numnumnum[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int lowest = 50;
		for(int a = 0; a<numnumnum.length; a++) {
			if(numnumnum[a]<lowest) {
				lowest = numnumnum[a];
			}
		}
		System.out.println(lowest);
		
		//9 print the entire array to see if step 8 was correct
		for(int e = 0; e<numnumnum.length; e++) {
			System.out.println(numnumnum[e]);
		}
		
		//10. print the largest number in the array.
		int biggest = 50;
		for(int b = 0; b<numnumnum.length; b++) {
			if(numnumnum[b]>biggest) {
				lowest = numnumnum[b];
			}
		}
		System.out.println(biggest);
      	}
}
