package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment04 {

	public static void main(String[] args) {
		// 1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<String> largestcities=new ArrayList<String>();
		largestcities.add("Hyderabad");
		largestcities.add("Chennai");
		largestcities.add("Bangalore");
		largestcities.add("Trivandrum");
		largestcities.add("Amaravathi");
		List<Integer> largestcitiesarea=new ArrayList<Integer>();
		largestcitiesarea.add(0, 650);
		largestcitiesarea.add(1, 426);
		largestcitiesarea.add(2, 741);
		largestcitiesarea.add(3, 241);
		largestcitiesarea.add(4, 217);
		int sumofthirdfourthcities=largestcitiesarea.get(2)+largestcitiesarea.get(3);
		System.out.println("Total area of the 3rd and 4th cities combined:" +sumofthirdfourthcities+ " KM2");
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> mustvisittouristattractions=new HashSet<String>();
		mustvisittouristattractions.add("Eiffel Tower:Paris, France.");
		mustvisittouristattractions.add("Colosseum:Rome, Italy.");
		mustvisittouristattractions.add("Taj Mahal:Agra, India.");
		mustvisittouristattractions.add("Louvre Museum:Paris, France.");
		mustvisittouristattractions.add("Times Square:Manhattan, New York City.");
		mustvisittouristattractions.add("Great Wall of China:Northern China.");
		mustvisittouristattractions.add("Sagrada Familia:Barcelona, Spain.");
		mustvisittouristattractions.add("Metropolitan Museum of Art:New York City.");
		mustvisittouristattractions.add("Vatican Museums:Vatican City.");
		mustvisittouristattractions.add("Gardens by the Bay:Singapore.");
		int sizeoftouristattractions=mustvisittouristattractions.size();
		System.out.println(mustvisittouristattractions+" & Size is:"+sizeoftouristattractions);
		
        //3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		int [] numbers = {10,20,30,40,50,60,70,80,90,100};
		int fifthvalue=numbers[5];
		int sixthvalue=numbers[6];
		int sum=fifthvalue+sixthvalue;
		int average=sum / 2;
		System.out.println(average);
		
		//4.Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> highestgrossingindianmovies=new ArrayList<String>();
		highestgrossingindianmovies.add("Dangal (2016)");
		highestgrossingindianmovies.add("Baahubali 2: The Conclusion (2017)");
		highestgrossingindianmovies.add("Pushpa 2: The Rule (2024)");
		highestgrossingindianmovies.add("RRR (2022)");
		highestgrossingindianmovies.add("K.G.F.: Chapter 2 (2022)");
		System.out.println("Top 3 highest-grossing movies of all time from the list:"+highestgrossingindianmovies.get(2));
		
		

	}

}
