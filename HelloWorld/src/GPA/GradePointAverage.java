package n2HW;

import java.util.Scanner;

public class GradePointAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of classes you would like to calculate");
String school = sc.nextLine();
int school1 = Integer.parseInt(school);
double gradePoint = 0;
double tch = 0;
double tgp = 0;
final double A = 4.00;

final double Aminus = 3.70;

final double Bplus = 3.33;

final double B = 3.00;

final double Bminus = 2.70;

final double Cplus = 2.30;

final double C = 2.00;

final double Cminus = 1.70;

final double Dplus = 1.30;

final double D = 1.00;

final double Dminus = 0.70;

final double WFF = 0;

String courseName;

double credits;

String grade;



for (int q = 0; q <= school1; q++) {
	System.out.println("Enter course information seperated commas  (course title, credit hours, letter grade) or type Q to quit");

	String courseInfo = sc.nextLine();
	
	
	
	

	if (courseInfo.equals ("Q")) {
		break;	
	
}
	else {
	

	String[] courseStuff = courseInfo.split(",");

	courseName = courseStuff[0];

	
	credits = Double.parseDouble(courseStuff[1].trim());
	
	grade = courseStuff [2];

if (courseName.equals("A")){
	gradePoint = credits * A;
	
}
else if (courseName.equals("A-")){
	gradePoint = credits * Aminus;
}
else if (courseName.equals("B+")){
	gradePoint = credits * Bplus;
}

else if (courseName.equals("B")){
	gradePoint = credits * B;
}
else if (courseName.equals("B-")){
	gradePoint = credits * Bminus;
}

else if (courseName.equals("C+")){
	gradePoint = credits * Cplus;
}
else if (courseName.equals("C")){
	gradePoint = credits * C;
}
else if (courseName.equals("C-")){
	gradePoint = credits * Cminus;
}
else if (courseName.equals("D+")){
	gradePoint = credits * Dplus;
}
else if (courseName.equals("D")){
	gradePoint = credits * D;
}
else if (courseName.equals("D-")){
	gradePoint = credits * Dminus;
}
else if (courseName.equals("WF/F")){
	gradePoint = credits * WFF;
}
System.out.println("Course name : " + courseName + "credits : " + credits + "grade: " + grade + "grade points" + gradePoint);
tch = tch * credits;
tgp = tgp + gradePoint;

}
	System.out.println("Total number of credit hours alloted" + tch);
	System.out.println("Total number of grade points" + tgp);
	System.out.println("Your gpa is: " + tgp/tch);
	}

	}
}