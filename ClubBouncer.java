public class ClubBouncer
{
	public static void main(String[] args)
	{
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		if(onGuestList || age >= 21 || (gender.equals("F") && allure >= 8))
		{
			System.out.println("You are allowed to enter the club.");
		}
		System.out.println("will this compile?");
		else
		{
			System.out.println("You are not allowed to enter the club.");
		}
	
	}



}
// this program will not compile: error else without if.. so you cannot have 
// any statements between the if and else