//Simulation: The Tortoise and the Hare
import java.security.SecureRandom;
import java.util.Scanner;

public class Tortoise_and_Hare_Race
{
  private static final SecureRandom randNum = new SecureRandom();
  private static int[] raceTrack = new int[71]; //race track for the two animals (ignore element zero)
  
  //Animal's positions
  private static int tortoisePos = 1;
  private static int harePos = 1;
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String start = "";
    System.out.printf( "The Tortoise and the Hare%n" );
    System.out.printf( ":========================:%n" );
    System.out.printf( "Welcome to this simulation of the famous race of the tortoise and the hare!%n%n" );
    System.out.printf( "Initials:%nT\tTortoise%nH\tHare%n%n" );
    System.out.printf("Note: when you see 'OUCH!!!' in the race, that means the tortoise has bitten the hare. (Way to go tortoise!)%n%n" );
    System.out.printf( "Enter any number/string to start the race!" );
    start = input.next();
    System.out.printf("BANG !!!!!%nAND THEY'RE OFF !!!!!%n%n");
    
    while(true)
    {
      int percentage = 1 + randNum.nextInt(10); //variable used to determine the animal's move type
      
      //Totrtoise's movements
      if(percentage >= 1 && percentage <= 5)
      {
        tortoisePos += 3; //Fast plod (3 squares to the right)
      }
      else if(percentage >= 6 && percentage <= 7)
      {
        if(tortoisePos <= 1)
        {
          tortoisePos = 1;
        }
        else
        {
          tortoisePos -= 6; //Slip (6 squares to the left)
        }
      }
      else if(percentage >= 8 && percentage <= 10)
      {
        tortoisePos += 1; //Slow plod (1 square to the right)
      }
      
      //Hare's movements
      if(percentage >= 1 && percentage <= 2)
      {
        harePos = harePos; //Sleep (no move at all)
      }
      else if(percentage >= 3 && percentage <= 4)
      {
        harePos += 9; //Big hop (9 squares to the right)
      }
      else if(percentage == 5)
      {
        if(harePos <= 1)
        {
          harePos = 1;
        }
        else
        {
          harePos -= 10; //Big slip (12 squares to the left)
        }
      }
      else if(percentage >= 6 && percentage <= 8)
      {
        harePos += 1; //Small hop (1 square to the right)
      }
      else if(percentage >= 9 && percentage <= 10)
      {
        if(harePos <= 1)
        {
          harePos = 1;
        }
        else
        {
          harePos -= 2; //Small slip (2 squares to the left)
        }
      }
      
      displayRace(); //display the race track
      
      //Race results
      if(tortoisePos >= 70 && harePos >= 70)
      {
        System.out.printf("TORT- oh wait...%nIt's a tie -_-%n");
        break;
      }
      if(tortoisePos >= 70)
      {
        System.out.printf("%nTORTOISE WINS!!! YAY!!!%n");
        break;
      }
      if(harePos >= 70)
      {
        System.out.printf("%nHare wins... Yuch.%n");
        break;
      }
    }//end while
  }//end main
  
  public static void displayRace()
  {
    for(int i = 1; i < raceTrack.length; ++i)
    {
      if(harePos == tortoisePos)
      {
        System.out.printf("OUCH!!!%n");
        break;
      }
      if(i == harePos)
      {
        System.out.printf("%s", "H");
      }
      if(i == tortoisePos)
      {
        System.out.printf("%s", "T");
      }
      else
      {
        System.out.print("-");
      }
      if(i == 70)
      {
        System.out.printf(" FINISH%n");
      }
    }//end for loop
  }//end displayRace method
  
}//end class