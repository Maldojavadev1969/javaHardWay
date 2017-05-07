import java.util.Scanner;

public class GenderTitles
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String title;
		
		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender =  keyboard.next();
		System.out.print("Age: ");
		int age = keyboard.nextInt();
		
		//if your not 20 years old then you dont get a title!
		if(age < 20)
		{ 
			title = first;
		}
		else
		{
			if(gender.equals("F"))
			{
				System.out.print("Are you married, " + first + "? (Y/N): ");
				String married = keyboard.next();
				if(married.equals("Y"))
				{
					title = "Mrs.";
				}
				else
				{
					title = "Ms.";
				}
				
			}
			else //if(gender.equals("M"))//else  //change this else statement to a suitable if statement!
			{
				title = "Mr.";			
			}
		
		}
		
		System.out.println("\n" + title + " " + last);
		
	
	}

}

// demonstration of nested if else statements with
// an important discussion of "Scope" is explained.
// essentially once a variable is declared and where that
// variable is declared to  the closing curly brace is that's
// variables scope...  and scope is " where the var is visible".

//this  was a great exercise! it caught me by surprise when it
//did not compile. the java compiler had the smarts to let me know
// that there was a possibility that title "may not be initialized!".
// if i did not use an if else condition and therefore expose
//the final print line to a var that did not contain a value in memory(undefined)!!
// So, the interesting point was that when i was using
// two nested if statements there was no guarantee that either if
// statement condition would ever be met... allowing the program to crash because
// of an uninitialized var!





