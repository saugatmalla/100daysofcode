import java.util.*;

public class Generalizations {
	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<String>(); // creating a ArrayList called sports that stores String types
    		sports.add("Football"); // adding "Football" to the sports ArrayList
    		sports.add("Boxing");
		sports.add(0, "Cricket"); // adding "Cricket" at position 0 of sports ArrayList




		for(String sport : sports) {//this is a forEach loop
      			System.out.println("I play " + sport);			
		}

		/* Major cities and the year they were founded
		creating a HashMap which is like a dictionary of "Python programming", that stores string and integer types */
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>(); 

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);

		//iterating the HashMap with forEach
		for (String city : majorCities.keySet() ) { 

			System.out.println(city + " was founded in " + majorCities.get(city));

		}



	}
}