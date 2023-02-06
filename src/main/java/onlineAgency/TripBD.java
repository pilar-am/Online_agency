package onlineAgency;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Add trips to an arraylist
 * 
 * @author Pilar Moreno
 *
 */
public class TripBD {

	private List<Trip> trips = new ArrayList<>();
	
	/**
	 * Add trips to arraylist trips
	 * 
	 * @return trips
	 */
	public List<Trip> tripsList() {
		trips.add(new LandTrip("Europe Popular Capitals", "Madrid", "London", 3, "Hotel Best", "Hotel Worst", 3, 4, Arrays.asList("París")));
		trips.add(new LandTrip("Europe laying out cities", "Berlín", "Madrid", 3, "Hotel Best", "Hotel Worst", 3, 4));
		trips.add(new AirTrip("Infinite Egipt", "Madrid", "الأقصر", 4, LocalTime.of(9,00), LocalTime.of(10, 0), Arrays.asList("القاهرة‎")));
		trips.add(new AirTrip("Incredible China", "Madrid", "1", 10, LocalTime.of(9,00), LocalTime.of(10, 0), Arrays.asList("Barcelona", "广州市")));	
		
		return trips;
	}

	/*
	Europe Popular Capitals; Land Trip; 3 days; Madrid, Paris, London; Hotel Best Madrid 3*, Hotel Worst Paris 4*
	Europe laying out cities; Land Trip; 3 days; Berlín, Madrid; Hotel Best Madrid 3*, Hotel Worst Berlin 4*
	Infinite Egipt; Air Trip; 4 days; Madrid, القاهرة‎, الأقصر‎; Madrid 09:00, الأقصر‎ 10:00
	Incredible China; Air Trip; 10 dies; Barcelona, Madrid, 广州市, 北京市; Madrid 09:00, 北京市 10:00
	 */
	
}
