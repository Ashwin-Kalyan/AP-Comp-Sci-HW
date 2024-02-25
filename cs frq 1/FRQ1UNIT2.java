
/**
 * Write a description of class FRQ1UNIT2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQ1UNIT2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FRQ1UNIT2
     */
    public FRQ1UNIT2()
    {
        // initialise instance variables
        String inputString = "Ashwin Ravuru Kalyan";
        int indexOne = inputString.indexOf(" ");
        String middleLast = inputString.substring(indexOne);
        int indexTwo = middleLast.indexOf(" ");
        String middle = middleLast.substring(0, indexTwo);
        System.out.println(middle);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
