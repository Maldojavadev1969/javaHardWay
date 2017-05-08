import java.util.Scanner;

public class DictionaryOrder 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;

		System.out.print( "Make up the name of a programming language! " );
		name = keyboard.nextLine();

		if ( name.compareToIgnoreCase("c++") < 0 )
			System.out.println( name + " comes BEFORE c++" );
		if ( name.compareToIgnoreCase("c++") == 0 )
			System.out.println( "c++ isn't a made-up language!" );
		if ( name.compareToIgnoreCase("c++") > 0 )
			System.out.println( name + "comes after c++");

		if ( name.compareToIgnoreCase("go") < 0 )
			System.out.println( name + " comes BEFORE go");
		if ( name.compareToIgnoreCase("go") == 0 )
			System.out.println( "go isn't a made-up language!" );
		if ( name.compareToIgnoreCase("go") > 0 )
			System.out.println( name + " comes AFTER go" );

		if ( name.compareToIgnoreCase("java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.compareToIgnoreCase("java") == 0 )
			System.out.println( "java isn't a made-up language!" );
		if ( name.compareToIgnoreCase("java") > 0 )
			System.out.println( name + " comes AFTER java" );

		if ( name.compareToIgnoreCase("lisp") < 0 )
			System.out.println( name + " comes BEFORE lisp" );
		if ( name.compareToIgnoreCase("lisp") == 0 )
			System.out.println( "lisp isn't a made-up language!" );
		if ( name.compareToIgnoreCase("lisp") > 0 )
 			System.out.println( name + " comes AFTER lisp" );

		if ( name.compareToIgnoreCase("python") < 0 )
			System.out.println( name + " comes BEFORE python" );
		if ( name.compareToIgnoreCase("python") == 0 )
			System.out.println( "python isn't a made-up language!" );
		if ( name.compareToIgnoreCase("python") > 0 )
			System.out.println( name + " comes AFTER python" );

		if ( name.compareToIgnoreCase("ruby") < 0 )
			System.out.println( name + " comes BEFORE ruby" );
		if ( name.compareToIgnoreCase("ruby") == 0 )
			System.out.println( "ruby isn't a made-up language!" );
		if ( name.compareToIgnoreCase("ruby") > 0 )	
			System.out.println( name + " comes AFTER ruby" );

		if ( name.compareToIgnoreCase("visualbasic") < 0 )
			System.out.println( name + " comes BEFORE visualbasic" );
		if ( name.compareToIgnoreCase("visualbasic") == 0 )
			System.out.println( "visualbasic isn't a made-up language!" );
		if ( name.compareToIgnoreCase("visualbasic") > 0 )
			System.out.println( name + " comes AFTER visualbasic" );
	}
}

//Scanner ".nextLine()" method is introduced: this will read all input the
//user types unlike ".next" which will not read spaces or anything else after the first word!
//in this exercise the ".compareTo method is introduced.
//this one will determine if it the string that is being compared is equal as well as
//determine  if the word being compared to comes before or after alpahabeticaly.
//The string method .equals only compares a string and returns a boolean
//vs the .CompareTo that returns an int that is used to compare the string.
//and finally its important to anticipate if the user does enter upper or lower case
//and to deal with that using "compareToIgnoreCase" or use the toLowerCase method.
