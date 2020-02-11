//testing
package model;

import java.util.Random;

public class DogRater {
	private final int DENOMINATOR = 10;
	private final int MAX = 14;
	private final int MIN = 11;
	private int rating;
	private String name;
	private String activity;

	public DogRater() {
		super();
		setRating();
	}

    /**
	 * @param name
	 */
	public DogRater(String name) {
		super();
		this.name = name;
		setRating();
	}
	

	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}


	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating() {
		// create random generator 
	    Random rand = new Random(); 
    // Generate random integers between MIN and MAX
		int range = MAX - MIN;
		rating = rand.nextInt(range)+MIN; 
	}	
	
@Override
public String toString() {
	String description = getName()+" is ";
	description += getRating()+"/"+DENOMINATOR +"!";
 return description;
}

public String getActivityDescription() {
	String activity = getActivity();	
		
	if (activity.equals("Sleep")) {return "Always ready for a snoozle! ";}
	else if (activity.equals("Fetch")) {return "Always ready to fetch again! ";}
	else if (activity.equals("Stuffed Toy")) {return "Always hangin' with the best stuffed fren! ";}
	return "Great dog!";
}
}
