import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//double m, kg, bmi;
		double in, lb, m, kg, bmi;
		
		System.out.print("Your height in inches: ");
		in = keyboard.nextDouble();
		//  convert in to m
		m = in /39.37;  // 1 m = 39.37in
		
		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();
		//convert lb to kg
		kg = lb / 2.2 ; // 1kg = 2.2 lbs
		
		// keep this calculation
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is  " + bmi);
	
	
	
	}


}