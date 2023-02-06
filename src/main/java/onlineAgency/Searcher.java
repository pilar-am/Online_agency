package onlineAgency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Pilar Moreno
 *
 */
public class Searcher {

	private List<Trip> allTrips = new ArrayList<>();

	
	/**
	 * Filters trips according to whether the city of departure or arrival matches the search
	 * The search can be in uppercase or lowercase
	 * 
	 * @param trips
	 * @param word
	 * @return allTrips
	 */
	public List<Trip> filterTrips(List<Trip> trips, String word) {
		String word2 = word.toLowerCase();		
		
		allTrips = trips.stream()
				.filter(trip -> trip.getDepartureCity().toLowerCase().contains(word2) 
						|| trip.getArrivalCity().toLowerCase().contains(word2) )
				.collect(Collectors.toList());
		
		return allTrips;
	}
	
	/**
	 * Shows the trips matching the search
	 */
	public void showTrips() {
		System.out.println();
		for(Trip t: allTrips) {
			System.out.println(t);
		}
	}

}
