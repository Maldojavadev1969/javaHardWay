import java.util.Scanner;


public class SecretWord
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String secret1 = "please", secret2 = "visitor", guess;// two strings declared one is initialized and the other is not
		
		System.out.print("Whats's the secret word? ");
		guess = keyboard.next();
		
		if(guess.equals(secret1) || guess.equals(secret2))
		{
			System.out.println("That's correct!");
		}
		else
		{
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}
		
		if(guess == secret1)
		{
			System.out.println("This will never ever show, no matter what.)");
			//this will never show because guess and secret are comparing
			//the memory location of the string variables and those locations
			// unlike the equals function will compare each char by char!!
		
		}
	
	
	}



}