
/**
 * This is a class that creates the variables needed to calculate distances of travel and speed based on miles
 * per hour. This class will be called in another driver class in order to print the values.
 * 
 * @author Andrew Wood
 * @version 2/21/2017
 */
public class SpeedConverter
{
     private double milesPerHour;
      private double milesPerMinute;
      private double feetPerHour;
      private double feetPerMinute;
      
      private final double FEET_PER_MILE;
      private final double MINUTES_PER_HOUR;
    /**
     * No-args constructor method that sets all the fields values to 0
     * except for the constants, those are set values
     */
    public SpeedConverter()
    {
     milesPerHour = 0;
     milesPerMinute = 0;
     feetPerHour = 0;
     feetPerMinute = 0;
      
     FEET_PER_MILE = 5280;
     MINUTES_PER_HOUR = 60;
    }
    /**
     * An overloaded constructor method calculate the values for the variables 
     * @param double inMilesPerHour used to calculate the values for all of the other measurements, except for the constants
     */ 
    
    public void SpeedConverter(double inMilesPerHour)
    {
      milesPerHour = inMilesPerHour;
      milesPerMinute = inMilesPerHour / MINUTES_PER_HOUR; //mph divded by 60
      feetPerHour = inMilesPerHour * FEET_PER_MILE; //mph divided by 5280
      feetPerMinute = (inMilesPerHour * FEET_PER_MILE)/MINUTES_PER_HOUR; //mph times 5280 divided by 60
      
    }

    /**
     * This set method changes the miles per hour field to the correct amount
     * @param  double inMilesPerHour used to hold the value for the miles per hour speed
     * 
     */
    public void setMilesPerHour(double inMilesPerHour)
    {
      milesPerHour = inMilesPerHour;
       milesPerMinute = inMilesPerHour / MINUTES_PER_HOUR;
      feetPerHour = inMilesPerHour * FEET_PER_MILE;
      feetPerMinute = (inMilesPerHour * FEET_PER_MILE)/MINUTES_PER_HOUR;
      
    }
    /**
    * Get method that will return the MPH speed
    * @return double milesPerHour, the value needed to calculate the other measurements
    */
   
    public double getMilesPerHour()
    {
        return milesPerHour;
    }
    /**
    * Get method used to get the number of miles per minute
    * @return milesPerMinute the value of the number of miles driven per minute
    */
    public double getMilesPerMinute()
    {
        return milesPerMinute;
    }
   /**
    * Get method used to get the number of feet per hour
    * @return double feetPerHour the value of the distance in feet driven in the hour
    */
    public double getFeetPerHour()
   {
       return feetPerHour;
   }
   /**
    * Get method that is used to get the feet driven per minute
    * @return double feetPerMinute the value of the distance in feet driven in the minute
    */
    
   public double getFeetPerMinute()
   {
       return  feetPerMinute;
   }
   /**
    * A toString method that will return a textual representation of the varible
    * Will be called in the driver class using the print statement
    */
   public String toString()
   {
       return "Miles Per Hour: " + milesPerHour +  "\nMiles Per Minute: " + milesPerMinute + "\nFeet Per Hour: " + feetPerHour + "\nFeet Per Minute: " + feetPerMinute;
   }
    
    
    
    
    
    
    
    
    
}
