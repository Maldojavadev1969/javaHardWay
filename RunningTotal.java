import java.util.Scanner;

public class RunningTotal
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int current = -1, total = 0;//it doesn't matter what
    //you initialize current to becuase its not added
    //until after current is reset in the loop

    System.out.print("Type in a bunch of values and I will add them up. ");
    System.out.println("I will stop when you type in a zero.");

    do
    {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;

      if(current != 0)
      {
        System.out.println("The total so far is: " + total);
      }

    }while(current != 0);

    System.out.println("The final total is: " + total);

  }

}
