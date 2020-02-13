package CarDecision;

import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cost of regular car: ");
		double regularCar = scan.nextDouble();
		System.out.println("Enter miles per gallon of regular car: ");
		double mpgRCAR = scan.nextDouble();
		System.out.println("Enter cost of hybrid car: ");
		double hybridCar = scan.nextDouble();
		System.out.println("Enter miles per gallon of hybrid car: ");
		double mpgHCAR = scan.nextDouble();
		System.out.println("Enter miles traveled in a year: ");
		double milesYear = scan.nextDouble();
		System.out.println("Enter cost per gallon of gas");
		double gallonGas = scan.nextDouble();
		
		double hybridCost =  hybridCar + (milesYear/mpgHCAR)* (gallonGas);
		double costCar = regularCar + (milesYear/mpgRCAR)* (gallonGas);
		int year = 1;
		for (int x = 0; x<5; x++)
		{
		if (hybridCost < costCar) {
		System.out.println("The cost after" + year +("years is Regular Car:" + costCar + (" For Hybrid Car: " + hybridCost)));
		System.out.println("The hybrid car pays back after" + year +"years");
		}
		else
		{
			System.out.println("The cost after " + year + (" years us Regular Car:" + costCar + (" For Hybrid Car:" + hybridCost)));
			costCar = costCar + (milesYear/mpgRCAR)* (gallonGas);
			hybridCost = hybridCost + (milesYear/mpgHCAR)* (gallonGas);
			year++;
		}
		}
			
			
		
	}

}
