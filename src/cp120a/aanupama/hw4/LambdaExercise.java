package cp120a.aanupama.hw4;

import java.util.Arrays;

public class LambdaExercise {
	
		public static void main(String[] args) {
		      
			String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
		              "Jupiter", "Saturn", "Uranus", "Neptune" };
		        
			    System.out.println('\n' + "Original planets array");
		        System.out.println(Arrays.toString(planets));
		        System.out.println("\nSorted in dictionary order (ascending):");
		        Arrays.sort(planets);
		        System.out.println( Arrays.toString(planets));

		        // lambda expression , dictionary order (descending)
		        System.out.println('\n' + "Sorted in dictionary order (descending)");
		        Arrays.sort(planets,(first,second) -> second.compareTo(first));
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , short to long
		        // hint the expression can be found in the LambdaTest.java from the book.
		        System.out.println('\n' + "Sorted by length (ascending):");
		        Arrays.sort(planets,(first , second) -> first.length() - second.length());
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , long to short
		        System.out.println('\n' + "Sorted by length (descending):");
		        Arrays.sort(planets,(first , second) -> second.length() - first.length());
		        System.out.println( Arrays.toString(planets));
		        
		        // lambda expression , reverse the name , then sort in ascending order
		        // hint use  new StringBuilder(first).reverse().toString() to reverse the string
		        System.out.println('\n' + "Sorted in dictionary order of the reversed name (ascending)");
		        
		        Arrays.sort(planets,(first,second) ->  (new StringBuilder(first).reverse().toString().compareTo( new StringBuilder(second).reverse().toString())));
		        System.out.println( Arrays.toString(planets));

		        // lambda expression , reverse the name , then sort in descending order
		        System.out.println('\n' + "Sorted in dictionary order of the reversed name (descending)");
		        Arrays.sort(planets,(first,second) ->  (new StringBuilder(second).reverse().toString().compareTo(new StringBuilder(first).reverse().toString())));
		        System.out.println( Arrays.toString(planets));
		}

}
