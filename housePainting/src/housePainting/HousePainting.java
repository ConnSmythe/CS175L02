package housePainting;
import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Accept all dimensions
		System.out.println("Enter width of the house:");
		int houseWidth = scan.nextInt();
		System.out.println("Enter length of the house:");
		int houseLength = scan.nextInt();
		System.out.println("Enter height of the house:");
		int houseHeight = scan.nextInt();
		System.out.println("Enter number of windows:");
		int numberOfWindows = scan.nextInt();
		System.out.println("Enter number of doors:");
		int numberOfDoors = scan.nextInt();
		System.out.println("Enter width of window");
		int windowWidth = scan.nextInt();
		System.out.println("Enter Length of window");
		int windowLength = scan.nextInt();
		System.out.println("Enter height of door");
		int doorHeight = scan.nextInt();
		System.out.println("Enter width of door");
		int doorLength = scan.nextInt();
		int houseSqFT = houseLength * houseWidth;
		int doorDimensions = doorHeight * doorLength;
		int windowDimensions = windowLength * windowWidth;
		int dimensions = doorDimensions + windowDimensions;
		System.out.println("Enter painter cost"); 
		int painterCost = scan.nextInt();
		double peakSQFT = (houseLength*houseWidth)+(.5*(houseLength(houseHeight-houseWidth)));
		System.out.println(peakSQFT);
		double normalSQFT = (houseSqFT * 2) + (peakSQFT*2);
		double finalSQFT = (normalSQFT - dimensions);
		double totalCost = (painterCost * finalSQFT);
		System.out.println("The Total cost" + totalCost );
		System.out.println("The total SQFT" +finalSQFT);
		
		
		
		
	
	}

	private static double houseLength(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

