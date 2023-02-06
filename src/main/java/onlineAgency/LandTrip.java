package onlineAgency;

import java.util.List;

/**
 * Inherit from Trip
 * 
 * @author Pilar Moreno
 *
 */
public class LandTrip extends Trip{

	private String hotel1;
	private String hotel2;
	private int categoryHotel1;
	private int categoryHotel2;
	private List<String> cities;
	
	/**
	 * First Constructor
	 * 
	 * @param tripName
	 * @param departureCity
	 * @param arrivalCity
	 * @param duration
	 * @param hotel1
	 * @param hotel2
	 * @param categoryHotel1
	 * @param categoryHotel2
	 */
	public LandTrip(String tripName, String departureCity, String arrivalCity, int duration, String hotel1,
			String hotel2, int categoryHotel1, int categoryHotel2) {
		super(tripName, departureCity, arrivalCity, duration);
		this.hotel1 = hotel1;
		this.hotel2 = hotel2;
		this.categoryHotel1 = categoryHotel1;
		this.categoryHotel2 = categoryHotel2;
	}

	/**
	 * Second Constructor
	 * 
	 * @param tripName
	 * @param departureCity
	 * @param arrivalCity
	 * @param duration
	 * @param hotel1
	 * @param hotel2
	 * @param categoryHotel1
	 * @param categoryHotel2
	 * @param cities
	 */
	public LandTrip(String tripName, String departureCity, String arrivalCity, int duration, String hotel1,
			String hotel2, int categoryHotel1, int categoryHotel2, List<String> cities) {
		super(tripName, departureCity, arrivalCity, duration);
		this.hotel1 = hotel1;
		this.hotel2 = hotel2;
		this.categoryHotel1 = categoryHotel1;
		this.categoryHotel2 = categoryHotel2;
		this.cities = cities;
	}

	/**
	 * Getters and Setters
	 */
	public String getHotel1() {
		return hotel1;
	}

	public void setHotel1(String hotel1) {
		this.hotel1 = hotel1;
	}

	public String getHotel2() {
		return hotel2;
	}

	public void setHotel2(String hotel2) {
		this.hotel2 = hotel2;
	}

	public int getCategoryHotel1() {
		return categoryHotel1;
	}

	public void setCategoryHotel1(int categoryHotel1) {
		this.categoryHotel1 = categoryHotel1;
	}

	public int getCategoryHotel2() {
		return categoryHotel2;
	}

	public void setCategoryHotel2(int categoryHotel2) {
		this.categoryHotel2 = categoryHotel2;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	/**
	 * Pass the arraylist cities to String
	 * 
	 * @return arrayCities
	 */
	public String showCities() {
		String arrayCities = String.join(", ", cities);
		return arrayCities;
	}

	@Override
	public String toString() {
		if(cities == null) {
			return super.getTripName() + "; Land Trip; " + super.getDuration()
			+ " days; " + super.getDepartureCity() + ", " 
			+ super.getArrivalCity() + "; " + hotel1 + " "  
			+ super.getDepartureCity() 
			+ " " + categoryHotel1 + "*, "
			+ hotel2 +" " + super.getArrivalCity() +" "+ categoryHotel2 + "*";
		}else {
			return super.getTripName() + "; Land Trip; " + super.getDuration()
			+ " days; " + super.getDepartureCity() + ", " 
			+ showCities() + ", "
			+ super.getArrivalCity() + "; " + hotel1 + " "  
			+ super.getDepartureCity() 
			+ " " + categoryHotel1 + "*, "
			+ hotel2 +" " + super.getArrivalCity() +" "+ categoryHotel2 + "*";
		}
	}
	
}
