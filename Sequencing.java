import java.util.Scanner;

public class Sequencing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print("How much is the purchase price? ");
		price = keyboard.nextDouble();
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t"  + salesTax);
		System.out.println("Total cost:\t" + total);
			
	
	
	}

}

// DRILL 1:
// attempted to recompile without initializing the variable price
// but using the var price without having any value in
// memory will not allow the program to compile. So price may not have
// been initialized does make sense

//Drill 2:
// moved the two lines of code after price had been set by the user
// and the code now functions correctly

//Drill 3:
// No, the program does not throw an error after un-intializing
// the var price at the beginning.. no  im not surprised because the price
// is initialized by the user from the scanner object  




