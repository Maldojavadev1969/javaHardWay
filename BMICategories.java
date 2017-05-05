import java.util.Scanner;

public class BMICategories 
{
	public static void main( String[] args ) 
	{
		Scanner keyboard = new Scanner(System.in); 
		
		double height, weight, m, in, lb, kg, bmi;		 
		
		System.out.print("Your height in inches: ");
		in = keyboard.nextDouble();
		//  convert in to m
		m = in /39.37;  // 1 m = 39.37in
		
		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();
		//convert lb to kg
		kg = lb / 2.2 ; // 1kg = 2.2 lbs
		
		bmi = kg / (m*m);
		
        //System.out.print( "Enter your BMI: " );
        //bmi = keyboard.nextDouble();
        
		System.out.print( "BMI category: " ); 
		if ( bmi < 15.0 ) 
		{
        	System.out.println( "very severely underweight" );
    	}
		else if ( bmi <= 16.0 ) 
		{
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 )
		{
            System.out.println( "underweight" );
        }
		else if ( bmi < 25.0 ) 
		{ 
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) 
		{
            System.out.println( "overweight" );
        }
		else if ( bmi < 35.0 ) 
		{
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) 
		{ 
			System.out.println( "severely obese" );
		} 
		else 
		{
    		System.out.println( "very severely/\"morbidly\" obese" );
		}
		
	} 
}
//Study Drills:

//1:
//this lesson shows that if you break rank with an if statement
//that all the if statements before it are ignored!