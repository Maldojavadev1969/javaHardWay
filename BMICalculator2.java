import java.util.Scanner;

public class BMICalculator2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//double m, kg, bmi;
		double in, lb, m, ft, kg, bmi;
		
		System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		//convert ft to inches
		in = ft * 12;
		
		System.out.print("Your height (inches): ");
		//need to add whats in memory for in and add it to the next input of in
		in = keyboard.nextDouble() + in;
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