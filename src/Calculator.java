import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
    double TotalMarks;
	double AveragePercentage;
	//ScannerClass
	Scanner marks=new Scanner(System.in);
	System.out.println("Enter the marks between 1-100");
	System.out.println("Enter the marks obtained in English");
	int English=marks.nextInt();
	System.out.println("Enter the marks obtained in Mathematics");
	int Mathematics=marks.nextInt();
    System.out.println("Enter the marks obtained in Science");
	int Science=marks.nextInt();
    System.out.println("Enter the marks obtained in Economics");
	int Economics=marks.nextInt();
    System.out.println("Enter the marks obtained in ComputerScience");
	int ComputerScience=marks.nextInt();
	
	//To Calculate the Average Percentage
	TotalMarks=(English+Mathematics+Science+Economics+ComputerScience);

	AveragePercentage=((TotalMarks)/5);
	
	//Grade Calculation
	if(AveragePercentage>95) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is A");
}
	else if(AveragePercentage>85) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is B");
}
	else if(AveragePercentage>70) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is C");
}
	else if(AveragePercentage>60) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is D");
}
	else if(AveragePercentage>50) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is E");
}
	else if(AveragePercentage<50) {
		System.out.println("The Totalmarks obtained by the Student"+" "+TotalMarks);
        System.out.println("The Average percentage obtained by the Student"+" "+AveragePercentage);
        System.out.println("The Grade obtained by the Student is F");
}
	}

}
