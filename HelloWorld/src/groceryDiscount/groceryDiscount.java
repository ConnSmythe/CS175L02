package groceryDiscount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class groceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
boolean begin = true;
DecimalFormat decimalHundredths = new DecimalFormat("0.00");
decimalHundredths.setMaximumFractionDigits(2);
while (begin = true) {
	System.out.println("Please enter the cost of your groceries or '0' to quit: ");
	
	double costGroceries = sc.nextDouble();
if (costGroceries == 0) {
	begin = false;
	return;
}
else if (costGroceries > 210) {
	System.out.println("You win a discount coupon of:"+ decimalHundredths.format(costGroceries * .14) + (" 14 percent of your purchase"));
}
else if (costGroceries > 150) {
	System.out.println("You win a discount coupon of: "+ decimalHundredths.format(costGroceries * .12) + (" 12 percent of your purchase"));
}
else if (costGroceries > 60) { 
	System.out.println("You win a discount coupon of: " + decimalHundredths.format(costGroceries * .10) + (" 10 percent of your purchase"));
}
else if (costGroceries >= 10) { 
	System.out.println("You win a discount coupon of: " + decimalHundredths.format(costGroceries * .08) + (" 8 of your purchase"));
}
else
	System.out.println("You are not eligible for a coupon this time.");
	}

}
}
