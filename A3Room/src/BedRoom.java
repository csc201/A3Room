
public class BedRoom extends Room {
	String curtain;
	
	public BedRoom() {
		super();
		curtain="no style";
	}
	
	public BedRoom(String color) {
		super(color);
		curtain="no style";
	}
	
	
	
	public String getCurtain() {
		return curtain;
	}

	public void setCurtain(String curtain) {
		this.curtain = curtain;
	}

	public double getArea() {
		return 45.0;
	}

	@Override
	public String toString() {
		return super.toString() + "BedRoom [curtain=" + curtain + "]";
	}
	
}
