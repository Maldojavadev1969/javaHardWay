import java.util.Scanner;

public class RudeQuestions
{
	public static void main(String[] args)
	{
		String name, music;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.print(name + " What kind of music do you like?");
		music = keyboard.next();
		System.out.println("You still listen to " + music + " \"Wow\".. thats embarassing!");
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.print(weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");
	
		
	
	}



}

// When you enter a integer where its expecting a double the program
// does not blow up because a double can a hold a larger value than
// an int and the compiler will allow a downcast to occur.

//When you enter a double or an int when the program is expecting
//a string it will not break the program because the program will
//handle it as ascii value for that number and will be treated as
//a String

//if you enter a name followed by a space and a name it will break.
//if you enter an age that is a string or a double it will break
//if you enter a weight as a string it will break
//if you enter a income as a string it will break
