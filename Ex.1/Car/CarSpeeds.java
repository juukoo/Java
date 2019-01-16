import java.util.Scanner;

public class CarSpeeds {

	public static void main(String[] args) {

		/*
		 * Initialize an array with 3 Car objects. Use the constructor to set
		 * the plateNr. Hardcode the plate numbers to: (“HGR-987”, “EFX-395”,
		 * “EFX-395”)
		 */

		Car[] array = new Car[3];

		array[0] = new Car("HGR-987");
		array[1] = new Car("EFX-395");
		array[2] = new Car("ACW-900");

		/*
		 * After the array is initialized, the program asks from the user via
		 * the command prompt the speed for each car, and sets the speed for the
		 * car calling the method setCurrentSpeed
		 */

		Scanner l = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Enter the speed of the car " + array[i].getPlateNr() + ": ");
			int newSpeed = l.nextInt();

			array[i].setCurrentSpeed(newSpeed);

		}

		/*
		 * If the user has provided an invalid speed (setCurrentSpeed returns
		 * “false”), the program will notify that the speed is invalid and will
		 * ask the speed again
		 */

		for (int i = 0; i < array.length; i++) {

			int j = 0;

			System.out.println("Enter the speed of the car " + array[j].getPlateNr() + ": ");
			int newSpeed = l.nextInt();

			while (array[j].setCurrentSpeed(newSpeed) == false) {

				System.out.println("Enter the speed of the car " + array[j].getPlateNr() + " again: ");
				newSpeed = l.nextInt();

			}

		}
		/*
		 * 
		 * After all the speeds are successfully set, the program will calculate
		 * the speed average of all three cars and print to the screen: “The
		 * average speed of cars is xxx Km/h” Run the program “CarSpeeds” and
		 * check if you got it right. Check the example execution below:
		 * 
		 * 
		 */

		double avg = 0;

		for (int i = 0; i < array.length; i++) {

			avg += array[i].getCurrentSpeed();

		}

		System.out.println("Average speed is: " + avg + " km/h.");

	}

}
