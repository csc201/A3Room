/**
 * 
 * @author tkanchanawanchai6403
 * Purpose: define object oriented programming concept by using Room example
 */
public class Room {
	/**
	 * define a color of the wall 
	 */
	private String wall;
	private String floor;
	private int windows;
	
	/**
	 * Initialize the wall color according to the default value ("")
	 */
	public Room() {
		wall="";
	}
	
	/**
	 * Initialize the wall color according to the parameter
	 * @param color a color of the wall
	 */
	public Room(String color) {
		this.wall = color;
	}
	
	public Room(int noOfWindows) {
		this.windows = noOfWindows;
	}
	
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	/**
	 * 
	 * @param color
	 */
	public void setWall(String color) {
		this.wall = color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getWall() {
		return this.wall;
	}

	@Override
	public String toString() {
		return "Room [wall=" + wall + ", getWall()=" + getWall()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
