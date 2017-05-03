import java.util.Scanner;


public class AgeMessages
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("You are: ");
		if(age < 13)
		{
			System.out.println("\ttoo young to create a facebook account" );
		}
		if(age > 13)
		{
			System.out.println("\told enough to create a facebook account" );
		}
		if(age < 16)
		{
			System.out.println("\ttoo young to get a drivers license");
		}
		if(age > 16)
		{
			System.out.println("\told enough to get a drivers license");
		}
		if(age < 18)
		{
			System.out.println("\ttoo young to get a tattoo");
		}
		if(age > 18)
		{
			System.out.println("\told enough to get a tattoo");
		}
		if(age < 21) 
		{
			System.out.println("\ttoo young to drink alcohol");
		}
		if(age > 21) 
		{
			System.out.println("\told enough to drink alcohol");
		}
		if(age < 35)
		{
			System.out.println("\ttoo young to run for the president of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
		if(age > 35)
		{
			System.out.println("\told enough to run for the president of the U.S.");
			System.out.println("\t\t(How happy!)");
		}
		if(age > 65)
		{
			System.out.println("\tYou are old enough to retire!");
		}
		if(age < 65)
		{
			System.out.println("\tYou are not old enough to retire!");
		}
	
	}



}

//Study Drills:

//1: if you are greater than 35 it prints out "You are: "
//	 because none of the if statements are true! and only the
// first println before the if statements gets printed

 
