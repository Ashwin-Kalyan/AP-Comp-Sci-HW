
/**
 * Worksheet 3.1
 *
 * @author Ashwin Kalyan
 * @version 1-16-24
 */
public class Main
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
    }
    /**
     * Creates a random number 1-10 inclusive.
     * @ return A random integer between 1-10 inclusive.
     */
    public static int randomInt() {
        int x = (int) (Math.random() * 10) + 1;
        return x;
    }
    /**
     * The worksheet problem solutions.
     */
    public void main()
    {
        // Q1
        Rectangle rect1 = new Rectangle();
        rect1.setLength(8);
        rect1.setWidth(6);
        rect1.getArea();
        System.out.println("Q1. Length: " + rect1.getLength() + "\nWidth: " + rect1.getWidth() + "\nArea: " + rect1.getArea());
        // Q2
        Rectangle rect2 = new Rectangle();
        rect2.setLength(randomInt());
        rect2.setWidth(randomInt());
        double area = rect2.getArea();
        System.out.println("Q2. Length: " + rect2.getLength() + "\nWidth: " + rect2.getWidth() + "\nArea: " + area);
        // Q3
        Rectangle rect3 = new Rectangle();
        rect3.setSides(randomInt(), randomInt());
        double area2 = rect3.getArea();
        System.out.println("Q3. Length: " + rect3.getLength() + "\nWidth: " + rect3.getWidth() + "\nArea: " + area2);   
        // Q4
        System.out.println("Q4. Diagonal of the first rectangle: " + rect1.getDiagonal());
        System.out.println("Q4. Diagonal of the second rectangle: " + rect2.getDiagonal());
        System.out.println("Q4. Diagonal of the third rectangle: " + rect3.getDiagonal());
        // Q5 - done 
        // Q6
        Rectangle rect4 = new Rectangle(randomInt(), randomInt());
        Rectangle rect5 = new Rectangle(randomInt(), randomInt());
        // Q7
        System.out.println("Fourth rectangle information: " + rect4.toString());
        System.out.println("Fifth rectangle information: " + rect5.toString());
    }
}
