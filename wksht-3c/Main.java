
/**
 * Write a description of class Main here.
 *
 * @author Ashwin Kalyan
 * @version 1-21-24
 */
public class Main
{
    // instance variables - replace the example below with your own
    final int INT_SIZE = 53;
    final int DBL_SIZE = 99;
    int[] intArray = new int[INT_SIZE];
    double[] dblArray = new double[DBL_SIZE];
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
    }
    
    /**
     * Creates a random number 0-99 inclusive.
     * @ return A random integer between 0-99 inclusive.
     */
    public int randomInt() {
        int x = (int) (Math.random() * 99);
        return x;
    }
    
    /**
     * Creates a random double 0.0-999.9 inclusive.
     * @ return A random double 0.0-999.9 inclusive.
     */
    public double randomDouble() {
        double x = Math.random() * 999;
        double tenths = (int)(x + .5);
        return tenths;
    }
    
    /**
     * Solutions to 3.2c
     */
    public void main() {
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        
        // It did not work.
        for (int ints : intArray) {
            dblArray[ints] = randomDouble();
        }
        
        System.out.println("4A. List of even elements: ");
        
        for (int i = 0; i < intArray.length; i++) {
             if (intArray[i] % 2 == 0) {
                count++;
                System.out.print(intArray[i] + " ");
            }
        }
        
        System.out.println("4B. List of even elements: ");
        for (int i : intArray) {
            if (intArray[i] % 2 == 0) {
                count2++;
                System.out.print(intArray[i] + " ");
            }
        }
        
        System.out.println("5A. List of elements between 500 and 600: ");
        
        for (int i = 0; i < intArray.length; i++) {
             if (intArray[i] >= 500 && intArray[i] <= 600) {
                count3++;
                System.out.print(intArray[i] + " ");
            }
        }
  
        System.out.println("5A. List of elements between 500 and 600: ");
        for (int i : intArray) {
            if (intArray[i] >= 500 && intArray[i] <= 600) {
                count4++;
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
