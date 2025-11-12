package language.basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assign4 {

	public static void main(String[] args) {
		
	/*****	Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined. ******/
		
		List<String> cities = new ArrayList<String>();
		
		cities.add("765");
		cities.add("2342");
		cities.add("7575.45");
		cities.add("8647");
		cities.add("55");
		
		System.out.println(cities.get(2));
		 
		System.out.println(cities.get(3));
		 
		float f = Float.parseFloat(cities.get(2) );
		float g = Float.parseFloat(cities.get(3) );
		
		System.out.println(f+g);
		
		System.out.println("*******************************************"); 		
		
		
		
		/******2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.*****/
		
		Set<String> hashSet =	new LinkedHashSet<String>();
		
		hashSet.add("Paris");
		hashSet.add("Delhi");
		hashSet.add("Proddatur");
		hashSet.add("Australia");
		hashSet.add("Egypt");
		hashSet.add("Paris");
		hashSet.add("proddatur");
		hashSet.add(null);
		hashSet.add("America");
		hashSet.add("Egypt");
		hashSet.add(null);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		System.out.println("*******************************************"); 	
		
/******** Create an array of 10 numbers and print out the Average of 5th & 6th Value.*******/
		
		int[] num = {9,6,8,2,9,10,92,76,29,29};
		System.out.println(num[4]);
		System.out.println(num[5]);
		
		int Average = (num[4]+num[5])/2;
		float Average2 =(num[4]+num[5])/2f;
		System.out.println("Average of 5,6 numbers is " + Average);

		System.out.println("Average of 5,6 numbers is " + Average2);


		System.out.println("*******************************************"); 		

//Create a list of the top 5 highest-grossing movies of all time and print out the third
//movie on the list.

		List<String> movies = new LinkedList<>();
		
		movies.add("Movie1");
		movies.add("Movie2");
		movies.add("Movie3");
		movies.add("Movie4");
		movies.add("Movie5");
		
		System.out.println(movies.get(2));
		
		






	}

}
