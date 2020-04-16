import java.util.*;
/**
 * This is a driver class that will allow the user to enter in the speed and will call to the 
 * SpeedConverter in order to get its values and will print them
 * 
 * @author Andrew Wood 
 * @version 2/21/17
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);//creates the scanner input
        
        SpeedConverter person;
        person = new SpeedConverter(); //creates a reference from the speed converter class
        double milesPerHour;
        char choice = 'a';
        
        while(choice != 'Q') //while the choice does not equal Q it will run
        {
        System.out.print("Enter your speed in terms of MPH : ");
        milesPerHour = input.nextDouble();
        person.setMilesPerHour(milesPerHour); //sets the value equal to the mph from speed converter method
       
        
        System.out.println(person.toString( ) ); //calls the to string method from speed converter to print values
        System.out.println("Would you like to quit? If so enter Q. If not, type anything else");
        choice = input.next().charAt(0); //takes the first character
       }
       System.out.println("Goodbye");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
