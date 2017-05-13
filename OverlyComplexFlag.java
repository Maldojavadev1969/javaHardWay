import static java.lang.System.*;

public class OverlyComplexFlag
{
  public static void main(String[] args)
  {
    printTopHalf();

    print41Colons();
    print41Ohs();
    print41Colons();
    print41Ohs();
    print41Colons();
    print41Ohs();
    printPledge();

  }

  public static void print41Colons()
  {
      out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print41Ohs()
  {
      out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons()
  {
      out.println( "|::::::::::::::::::::::::::::::::::::|" );
  }

   public static void printPledge()
  {
      out.println( "I pledge allegiance to the flag." );
  }

  public static void print29Ohs()
  {
      out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print6Stars()
  {
      out.print("|* * * * * *");
  }

  public static void print5Stars()
  {
      out.print("| * * * * * ");
  }

  public static void printSixStarLine()
  {
      print6Stars();
      print29Ohs();
  }

  public static void printFiveStarLine()
  {
      print5Stars();
      print29Colons();//needs 36 instead of 29
  }

  public static void printTopHalf()
  {
      out.println( " ________________________________________________" );
      printSixStarLine();
      printFiveStarLine();
      printSixStarLine();
      printFiveStarLine();
      printSixStarLine();
      printFiveStarLine();
      printSixStarLine();
  }


}
