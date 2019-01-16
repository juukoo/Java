import java.util.Scanner;

public class CarSpeeds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner syote = new Scanner(System.in);

		Car[] array = new Car[3];
		
		array[0] = new Car("HGR-987");
		array[1] = new Car("EFX-395");
		array[2] = new Car("ACW-900");
		
					
	for (int i = 0; i < array.length; i++) {

		int j = 0;

		System.out.println("Enter the speed of the car " + array[j].getPlateNr() + ": ");
		int newSpeed = syote.nextInt();

		while (array[j].setCurrentSpeed(newSpeed) == false) {

			System.out.println("Enter the speed of the car " + array[j].getPlateNr() + " again: ");
			newSpeed = syote.nextInt();

		}

	}
			
		double avg = 0;
		
		for (int i = 0; i < array.length; i++){
				
			avg += array[i].getCurrentSpeed();
		}
		
		System.out.println("The average speed of cars is "+ avg + " km/h.");
		
	}

	
}


