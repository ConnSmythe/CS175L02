package CarDecision;
import java.util.Scanner; 
public class CarDecision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String stringTosplit = "Toyata Corolla,28000,20";
String [] splitStuff =  stringTosplit.split(",");
System.out.println(splitStuff[1]);
System.out.print(splitStuff[2]);;
String stringTosplitsecond = "Toyota Prius,31000,30";
String [] splitStuff2 = stringTosplitsecond.split(",");
System.out.println(splitStuff2[1]);
System.out.print(splitStuff2[2]);
double regularCar = Double.parseDouble(splitStuff[1]);
double hybridCar = Double.parseDouble(splitStuff2[1]);
double mpgHCAR = Double.parseDouble(splitStuff2[2]);
double mpgRCAR = Double.parseDouble(splitStuff[2]);
System.out.println("Enter miles traveled in a year");
double milesYear = scan.nextDouble();
System.out.println("Enter the total cost of the gasoline: ");
double gallonGas = scan.nextDouble();
double hybridCost =  hybridCar + (milesYear/mpgHCAR)* (gallonGas);
double costCar = regularCar + (milesYear/mpgRCAR)* (gallonGas);
int year = 1;
for (int x = 0; x<5; x++)
{
if (hybridCost < costCar) {
System.out.println("The cost after toyota Corolla" + year +("years is :" + costCar + (" For toyota Prius: " + hybridCost)));
System.out.println("The toyota Prius pays back after" + year +"years");
}
else
{
	System.out.println("The cost after " + year + (" years is toyota Corolla:" + costCar + (" For toyota Prius:" + hybridCost)));
	costCar = costCar + (milesYear/mpgRCAR)* (gallonGas);
	hybridCost = hybridCost + (milesYear/mpgHCAR)* (gallonGas);
	year++;
}


}
	}

}
