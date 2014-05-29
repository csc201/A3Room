
public class DiningRoom extends Room {
	String chandaliar;
	public String getChandaliar() {
		return chandaliar;
	}

	public void setChandaliar(String chandaliar) {
		this.chandaliar = chandaliar;
	}

	public DiningRoom() {
		chandaliar = "small";
	}
	
	public DiningRoom(String color) {
		super(color);
		chandaliar="no";
	}
	
	
	public double getArea() {
		return 300.50;
	}

	@Override
	public String toString() {
		return super.toString() + "DiningRoom [chandaliar=" + chandaliar + ", getChandaliar()="
				+ getChandaliar() + ", getArea()=" + getArea() + "]";
	}
	
	
	
	
}
