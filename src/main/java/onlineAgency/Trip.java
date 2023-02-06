package onlineAgency;

/**
 * 
 * @author Pilar Moreno
 * 
 */
public class Trip {
	
	private String tripName;
	private String departureCity;
	private String arrivalCity;
	private int duration;
	
	/**
	 * Constructor with all properties
	 * 
	 * @param tripName
	 * @param departureCity
	 * @param arrivalCity
	 * @param duration
	 */
	public Trip(String tripName, String departureCity, String arrivalCity, int duration) {
		this.tripName = tripName;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.duration = duration;
	}
	
	/**
	 * Getters, Setters and toString
	 * 
	 */
	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Trip [tripName=" + tripName + ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity
				+ ", duration=" + duration + "]";
	}

	

	
}
