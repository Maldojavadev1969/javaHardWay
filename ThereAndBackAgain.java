public class ThereAndBackAgain
{
  public static void main(String[] args)
  {
    System.out.println("Here.");
    erebor();
    System.out.println("Back first time.");
    //erebor();
    System.out.println("Back second time.");
  }

  public static void erebor()
  {
    System.out.println("There.");
  }

}
//Drill 1:
//removed the parens on the function call
//and the program will not compile and throws an
//error not a statement

//Drill 2:
//output will be missing the second "there" print message
