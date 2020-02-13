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
String [] splitStuff2 = stringTosplit.split(",");
System.out.println(splitStuff2[1]);
System.out.print(splitStuff[2]);
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
