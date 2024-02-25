
/**
 * Write a description of class TwoDice here.
 *
 * @author Ashwin Kalyan
 * @version 1-16-24
 */
public class TwoDice
{
    private int roll_1;
    private int roll_2;
        
    /**
     * Constructor for objects of class TwoDice
     */
    public TwoDice(int rollVal1, int rollVal2)
    {
        // initialise instance variables
        roll_1 = rollVal1;
        roll_2 = rollVal2;
    }

    /**
     * Takes an integer and returns the integer value of the die requested
     *
     * @param num  Integer input by user to determine what die is requested
     * @return  If number inputted is 1 it returns roll 1, if anything else it returns roll 2
     */
    public int value(int num)
    {
        if (num == 1) {
            return roll_1;
        } else {
            return roll_2;
        }
    }
    
    /**
     * Calculates the sum of two rolls.
     * 
     * @return The sum of two rolls.
     */
    public int dieSum() {
        return roll_1 + roll_2;
    }
    
    /**
     * Returns a description of the TwoDice class in string format.
     * 
     * @return The description of the TwoDice class.
     */
    public String toString() {
        String str = "The value of the die rolls are " + roll_1 + " and " + roll_2 + ", and the sum is " + dieSum();
        return str;
    }
}
