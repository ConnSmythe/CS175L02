package FinalHousePainting;

import java.util.Scanner;

public class FinalHousePainting {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the width of the house: ");
		int houseWidth = scan.nextInt();
		System.out.println("Enter the length of the house: ");
		int houseLength = scan.nextInt();
		System.out.println("Enter the height of the house: ");
		int houseHeight = scan.nextInt();
		System.out.println("Enter the number of windows: ");
		int numberOfWindows = scan.nextInt();
		System.out.println("Enter the length of the window: ");
		int windowLength = scan.nextInt();
		System.out.println("Enter the width of the window: ");
		int windowWidth = scan.nextInt();
		System.out.println("Enter the number of doors: ");
		int numberOfDoors = scan.nextInt();
		System.out.println("Enter the length of the door: ");
		int doorLength = scan.nextInt();
		System.out.println("Enter the width of the door: ");
		int doorWidth = scan.nextInt();
		int windowDimensions = (numberOfWindows * windowLength * windowWidth);
		int doorDimensions = (numberOfDoors * doorLength * doorWidth);
		double houseSqFT = 2*(houseLength * houseWidth) +2*(houseLength * houseWidth) + (houseLength*(houseHeight - houseWidth));
		System.out.println("Enter the painter cost: ");
		double painterCost = scan.nextDouble();
		double totalSqFT = (houseSqFT - doorDimensions - windowDimensions)*painterCost;
		System.out.println(totalSqFT);
				
				
			
		
	}

}
