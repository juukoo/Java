
public class Car {

	/*
	 * - MAX_SPEED: int - plateNr: String - currentSpeed: Integer
	 * 
	 * + Car (String plateNr) + getPlateNr (): String + setCurrentSpeed (int
	 * speed): Boolean + getCurrentSpeed (): Integer
	 * 
	 */

	private static int MAX_SPEED = 250;
	private String plateNr;
	private int currentSpeed;

	public Car(String plateNr) {
		this.plateNr = plateNr;
		currentSpeed = 0;
	}

	public String getPlateNr() {
		return this.plateNr;
	}

	/*
	 * If the user has provided an invalid speed (setCurrentSpeed returns
	 * “false”), the program will notify that the speed is invalid and will ask
	 * the speed again
	 * 
	 */

	public boolean setCurrentSpeed(int speed) {
		if (speed < 0 || speed > MAX_SPEED)
			return false;
		else {
			this.currentSpeed = speed;
			return true;
		}
	}

	public int getCurrentSpeed() {
		return this.currentSpeed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
