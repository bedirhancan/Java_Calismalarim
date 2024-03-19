package helicopter;

public class Propeller {

	private int width;
	private int rpm;

	public Propeller(int width, int rpm) {
		this.width = width;
		this.rpm = rpm;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
}
