package onlineAgency;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Pilar Moreno
 *
 */
public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Instance of the class where the trips are stored
		TripBD trips = new TripBD();
		
		//Arraylist where all the trips are
		List<Trip> tripsList = trips.tripsList();
		
		//Instance of the class where are the methods for filter
		Searcher searcher = new Searcher();
		
		
		System.out.println("TRAVEL SEARCH ENGINE");
		
		boolean searching = true, ok = false;
		int option;
		do {
			String term = menu();
			
			//Filter the trips according to the search term
			List<Trip> foundTrips = searcher.filterTrips(tripsList, term);
						
			if(foundTrips.isEmpty()) {
				System.out.println("\nNo trips were found according to your search terms");
			}else {
				searcher.showTrips();
			}
			
			option = readWholeNumber("\nDo you want to continue searching? (1->'yes', 2->'no')");
				
			do {
				if(option == 2) {
					searching = false;
					ok = true;
				}else if(option == 1) {
					searching = true;
					ok = true;
				}else {
					System.out.println("Incorrect option");
					option = readWholeNumber("Do you want to continue searching? (1->'yes', 2->'no')");
					ok = false;
				}
			}while(!ok);
			
		}while(searching);
		
		System.out.println("\nThanks for using our app");
	}
	
	/**
	 * Method that requests a string, checks that the string is not empty and 
	 * if it is not, returns a string
	 * 
	 * @return word
	 */
	public static String menu() {
		String word;
		boolean noTerms = false;
		
		do {
			System.out.println("Enter your search terms");
			word = scan.nextLine();
			if(word.isEmpty()) {
				System.out.println("No search terms have been introduced");
				noTerms=true;
			}else {
				noTerms=false;
			}
		}while(noTerms);
		return word;
	}
	
	/**
	 * Method that requests an integer, checks that it is indeed an integer 
	 * and when it is, returns it
	 * 
	 * @param message
	 * @return num
	 */
	public static int readWholeNumber(String message) {
		int num=0;
		boolean notOk;
			do {
				try {
					notOk = false;
					System.out.println(message);
					num = scan.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("You have to enter a whole number");
					scan.next();
					notOk = true;
				}
				scan.nextLine();
			}while(notOk);
		return num;
	}
}
