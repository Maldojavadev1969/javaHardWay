import java.util.Scanner;

public class ShallowGrandmother
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute, happy;
		boolean allowed, allowed2;
		
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		
		System.out.print("Enter your yearly income: ");
		income = keyboard.nextDouble();
		
		System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
		cute = keyboard.nextDouble();
		
		System.out.print("How happy do you make them, on a scale of 1 to 10? ");
		happy = keyboard.nextInt();
	
		allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
		
		//my age is 48 so if they are +- 5 years are the business rules
		allowed2 = (age >= 43 && age <= 53 && (happy > 7 && happy <= 10)); 
		
		System.out.println("Allowed to date my grandchild? " + allowed);
		System.out.println("Compatible age and you make me happy? " + allowed2);
		
		
	}


}