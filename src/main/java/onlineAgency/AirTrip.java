package onlineAgency;

import java.time.LocalTime;
import java.util.List;

/**
 * Inherit from Trip
 * 
 * @author Pilar Moreno
 *
 */
public class AirTrip extends Trip{

	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private List<String> flightStopOver;
	
	/**
	 * First Constructor
	 * 
	 * @param tripName
	 * @param departureCity
	 * @param arrivalCity
	 * @param duration
	 * @param departureTime
	 * @param arrivalTime
	 */
	public AirTrip(String tripName, String departureCity, String arrivalCity, int duration, LocalTime departureTime,
			LocalTime arrivalTime) {
		super(tripName, departureCity, arrivalCity, duration);
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	
	/**
	 * Second Constructor
	 * 
	 * @param tripName
	 * @param departureCity
	 * @param arrivalCity
	 * @param duration
	 * @param departureTime
	 * @param arrivalTime
	 * @param flightStopover
	 */
	public AirTrip(String tripName, String departureCity, String arrivalCity, int duration, LocalTime departureTime,
			LocalTime arrivalTime, List<String> flightStopover) {
		super(tripName, departureCity, arrivalCity, duration);
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightStopOver = flightStopover;
	}

	/**
	 * Getters and Setters
	 */
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
		
	public List<String> getFlightStopOver() {
		return flightStopOver;
	}

	public void setFlightStopOver(List<String> flightStopOver) {
		this.flightStopOver = flightStopOver;
	}

	/**
	 * Pass the arraylist flightStopOver to String
	 * 
	 * @return arrayCities
	 */
	public String showFlightStopOver() {
		String arrayCities = String.join(", ", flightStopOver);
		return arrayCities;
	}
	
	@Override
	public String toString() {
		if(flightStopOver == null) {
			return super.getTripName() + "; Air Trip; " + super.getDuration()
			+ " days; " + super.getDepartureCity() + ", " 
			+ super.getArrivalCity() + "; " + super.getDepartureCity() 
			+ " " + departureTime + ", " + super.getArrivalCity()
			+ " " + arrivalTime;
		}else {
			return super.getTripName() + "; Air Trip; " + super.getDuration()
			+ " days; " + super.getDepartureCity() + ", " 
			+ showFlightStopOver() + ", "
			+ super.getArrivalCity() + "; " + super.getDepartureCity() 
			+ " " + departureTime + ", " + super.getArrivalCity()
			+ " " + arrivalTime;
		}
	}
		
}
