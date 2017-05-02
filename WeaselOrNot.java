import java.util.Scanner;

public class WeaselOrNot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println("Type the word \"weasel\", please. ");
		word = keyboard.next();
		
		yep = "weasel".equals(word);  // is this what they want ?
		//yep = word.equals("weasel");
		nope = ! word.equals("weasel");
		
		System.out.println("You typed what was requested: " + yep);
		System.out.println("You ignored polite instructions; " + nope);
	
	
	}


}

// yes it does work because every string  
// can use the string object library and in this case
// the .Equals method since the compiler recognizes the
// word "weasel" wrapped in quotes to represent a string

