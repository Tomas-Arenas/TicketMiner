/**
 * @author Brittany Madrigal
 * ID: 80633008
 * Last updated: Oct. 30, 2022
 * @version 2.0
 **/

public class Venue {
    private String venueName;
    private String venueType;
    private int ID;
    private int capacity;
    private int concertCapacity;
    private float cost;
    private int vipPercent;
    private int goldPercent;
    private int silverPercent;
    private int bronzePercent;
    private int generalPercent;
    private int reservedPercent;
    private double vipSeatsRemaining;
    private double goldSeatsRemaining;
    private double silverSeatsRemaining;
    private double bronzeSeatsRemaining;
    private double generalSeatsRemaining;

    /**
     * Method used to set the value of all the values of the venue.
     *
     * @param venueID Unique ID of venue.
     * @param venueName Venue's name.
     * @param venueType Venue's type.
     * @param capacity The capacity of venue.
     * @param concertCapacity The capacity of concert venue.
     * @param venueCost The cost of the using venue.
     * @param vipPercent Percent of vip seats.
     * @param goldPercent Percent of gold seats.
     * @param silverPercent Percent of silver seats.
     * @param bronzePercent Percent of bronze seats.
     * @param gaPercent Percent of general admission seats.
     * @param reservedPercent Percent of reserved seats.
     */

    public Venue(int venueID, String venueName, String venueType, int venueCapacity, int concertCapacity, float venueCost,
            int vipPercent, int goldPercent, int silverPercent, int bronzePercent, int generalPercent, int reservedPercent){
        this.venueName = venueName;
        this.venueType = venueType;
        this.ID = venueID;
        this.capacity = venueCapacity;
        this.concertCapacity = concertCapacity;
        this.cost = venueCost;
        this.vipPercent = vipPercent;
        this.goldPercent = goldPercent;
        this.silverPercent = silverPercent;
        this.bronzePercent = bronzePercent;
        this.generalPercent = generalPercent;
        this.reservedPercent = reservedPercent;
        this.vipSeatsRemaining = (this.vipPercent/100.00)* this.capacity;
        this.goldSeatsRemaining = (this.goldPercent/100.00)*this.capacity;
        this.silverSeatsRemaining = (this.silverPercent/100.00)*this.capacity;
        this.bronzeSeatsRemaining = (this.bronzePercent/100.00)*this.capacity;
        this.generalSeatsRemaining = (this.generalPercent/100.00)*this.capacity;

    }

    /**
     * Method used to set the venue values to string
     * @return String of all values
     */
    //@Override
    public String toString() {
        return (this.ID + " " + this.venueName + " " + this.venueType  + " " + this.capacity + " " + this.concertCapacity
                + " " + this.cost + " " + this.vipPercent + " " + this.goldPercent + " " + this.silverPercent + " "
                + this.bronzePercent + " " + this.generalPercent + " " + this.reservedPercent);
    }

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueType() {
		return venueType;
	}

	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getConcertCapacity() {
		return concertCapacity;
	}

	public void setConcertCapacity(int concertCapacity) {
		this.concertCapacity = concertCapacity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getVipPercent() {
		return vipPercent;
	}

	public void setVipPercent(int vipPercent) {
		this.vipPercent = vipPercent;
	}

	public int getGoldPercent() {
		return goldPercent;
	}

	public void setGoldPercent(int goldPercent) {
		this.goldPercent = goldPercent;
	}

	public int getSilverPercent() {
		return silverPercent;
	}

	public void setSilverPercent(int silverPercent) {
		this.silverPercent = silverPercent;
	}

	public int getBronzePercent() {
		return bronzePercent;
	}

	public void setBronzePercent(int bronzePercent) {
		this.bronzePercent = bronzePercent;
	}

	public int getGeneralPercent() {
		return generalPercent;
	}

	public void setGeneralPercent(int generalPercent) {
		this.generalPercent = generalPercent;
	}

	public int getReservedPercent() {
		return reservedPercent;
	}

	public void setReservedPercent(int reservedPercent) {
		this.reservedPercent = reservedPercent;
	}

	public double getVipSeatsRemaining() {
		return vipSeatsRemaining;
	}

	public void setVipSeatsRemaining(double vipSeatsRemaining) {
		this.vipSeatsRemaining = vipSeatsRemaining;
	}

	public double getGoldSeatsRemaining() {
		return goldSeatsRemaining;
	}

	public void setGoldSeatsRemaining(double goldSeatsRemaining) {
		this.goldSeatsRemaining = goldSeatsRemaining;
	}

	public double getSilverSeatsRemaining() {
		return silverSeatsRemaining;
	}

	public void setSilverSeatsRemaining(double silverSeatsRemaining) {
		this.silverSeatsRemaining = silverSeatsRemaining;
	}

	public double getBronzeSeatsRemaining() {
		return bronzeSeatsRemaining;
	}

	public void setBronzeSeatsRemaining(double bronzeSeatsRemaining) {
		this.bronzeSeatsRemaining = bronzeSeatsRemaining;
	}

	public double getGeneralSeatsRemaining() {
		return generalSeatsRemaining;
	}

	public void setGeneralSeatsRemaining(double generalSeatsRemaining) {
		this.generalSeatsRemaining = generalSeatsRemaining;
	}


}

/**
 * Class venue that holds whether they are on campus or not.
 */
class Auditorium{
    boolean onCampus = true;
    public Auditorium(boolean onCampus){
        this.onCampus = onCampus;
    }

}
/**
 * Class venue that holds whether they are on campus or not.
 */
class Stadium{
    boolean onCampus = true;
    public Stadium(boolean onCampus){
        this.onCampus = onCampus;
    }

}
/**
 * Class venue that holds whether they are on campus or not.
 */
class Arena{
    boolean onCampus = true;
    public Arena(boolean onCampus){
        this.onCampus = onCampus;
    }

}
/**
 * Class venue that holds whether they are on campus or not.
 */
class openAir {
    boolean onCampus = true;
    public openAir(boolean onCampus){
        this.onCampus = onCampus;
    }
}
