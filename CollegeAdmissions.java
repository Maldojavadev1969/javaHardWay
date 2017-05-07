import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmissions
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int math;
		
		out.println("Welcome to the UT Austin College Admissions Interface!");
		out.print("Please enter your SAT math score(200-800): ");
		math = keyboard.nextInt();
		
		out.print("Admittance status: ");
		
		if(math >= 790)
			out.print("CERTAIN ");
		else if(math >= 390)
			out.print("UNLIKELY ");
		else if(math >= 710)
			out.print("SAFE ");
		else if(math >= 580)
			out.print("PROBABLE ");
		else if(math >= 500)
			out.print("UNCERTAIN ");
		else // below 390
			out.print("DENIED ");
			
		out.println();
	
	}


}


//make sure that the very first if statement in the chain is the one which is hardest to achieve
//Drills:
//the point of this drill was to use the if else conditions in the correct
//order where the most unlikely situation is the first one to be tested
//and to also realize that if you dont use else if's that the if else's have to be 
//nested to get the same results and this can be harder to set up!