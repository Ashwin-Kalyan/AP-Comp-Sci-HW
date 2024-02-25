
/**
 * Write a description of class Main here.
 *
 * @author Ashwin Kalyan
 * @version 1-16-24
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
    }

    /**
     * Solutions to 3.2
     */
    public void main()
    {
        // Q4
        final int ROLLS = 100;
        int val = 0;
        int max = 0;
        TwoDice[] arrOfRolls = new TwoDice[ROLLS];
        int[] counter = new int[12];
         
        for (int i = 0; i < 100; i++) {
            arrOfRolls[i] = new TwoDice(randomInt(), randomInt());
            int sum = arrOfRolls[i].dieSum();
            counter[sum]++;
        }
        // Q5
        for (int i = 2; i < counter.length; i++) {
            if (counter[i] > counter[i - 1]) {
                max = counter[i];
                val = i;
            }
        }
        
        System.out.println("The sum that occurs most often is " + val + ", which occurs " + max + " times.");
        
        // Q6
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arrOfRolls[i] + " ");
        }
    }
    
    /**
     * Creates a random number 1-6 inclusive.
     * @ return A random integer between 1-6 inclusive.
     */
    public static int randomInt() {
        int x = (int) (Math.random() * 6) + 1;
        return x;
    }
}
