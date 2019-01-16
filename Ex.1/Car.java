
public class Car {
	
	private int MAX_SPEED = 250;
	private String plateNr;
	private int currentSpeed;
	
	public Car(String PlateNr){
		this.plateNr = PlateNr;
		currentSpeed = 0;
	}
	
	public String getPlateNr(){
		return this.plateNr;	
		}
	
	public boolean setCurrentSpeed(int speed){
		if (speed < 0 || speed > MAX_SPEED)
			return false;
			else{
				this.currentSpeed = speed;
				return true;
			}
		}
		
	
	public int getCurrentSpeed(){
		return this.currentSpeed;
	}

	

}
	
	

