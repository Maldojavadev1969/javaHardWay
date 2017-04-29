public class PrintingChoicesEscapes
{
	public static void main(String[] args)
	{
	
	    System.out.println("Alpha\nBravo\nCharlie\nDelta\n\nEchoFoxtrotGolf\nHotel\nIndia\n\nThis is a test.\nI am learning Java the hard way\n");

		//re-printed the line to match the output below  but used escape chars above with one println()	
	
		System.out.println("Alpha");
		System.out.println("Bravo");
		
		System.out.println("Charlie");
		System.out.println("Delta");
		System.out.println();
		
		System.out.print("Echo");
		System.out.print("Foxtrot");
		
		System.out.println("Golf");
		System.out.print("Hotel");
		System.out.println();
		System.out.println("India");
		
		System.out.println();
		System.out.println("This" + " " + "is" + " " + "a" + " test.");
		System.out.println("I am" + " " + "learning Java" + " " + "the hard way");
		
		
		
		
	}
}