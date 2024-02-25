/**
 * This is the definition of the Rectangle class for use in AP Computer Science.
 * Class is used and enhanced in Worksheet 3-1.
 * 
 * @author Ashwin Kalyan
 * @version January 2024
 * 
 */
public class Rectangle
{
    // instance variables     
    private double length;
    private double width;
    private double area;
    private double perimeter;

    /**
     * Constructor for objects of class Rectangle
     * This is an example of a constructor that does not take any parameters... you will be asked to write another      
     * constructor for the class that takes two parameters to set the length and the width
     */
    public Rectangle()
    {
        // initialize instance variables
        length = 0;
        width = 0;
        area = 0;
        perimeter = 0;
    }
    /**
     * Constructor for objects of class Rectangle
     * This is an example of a constructor that DOES take in parameters
     * 
     * @param len  The double length of the rectangle.
     * @param wid  The double width of the rectangle.
     */
    public Rectangle(double len, double wid) {
        // initialize instance variables
        length = len;
        width = wid;
        area = 0;
        perimeter = 0;
    }
	

    /**
     * Set the length side of the Rectangle.
     * 
     * @param  y   The value to assign to the length of the Rectangle
     * @return     true if the value of the side is legal, otherwise false 
     */
    public boolean setLength(double y)
    {
        if (y <= 0)
            return false;
        length = y;
        return true;
    }    

    /**
     * Set the width side of the Rectangle.
     * 
     * @param  y   The value to assign to the width of the Rectangle
     * @return     true if the value of the side is legal, otherwise false 
     */
    public boolean setWidth(double y)
    {
        if (y <= 0)
            return false;
        width = y;
        return true;
    }


    /**
     * Get the size of the length side of the Rectangle.
     *
     * @return     the length of the length side of the Rectangle
     */
    public double getLength()
    {
        return length;
    }

    /**
     * Get the size of the width side of the Rectangle.
     *
     * @return     the width of the Rectangle
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * Get the area of the Rectangle, 0 if either side not yet initialized.
     *
     * @return The area of the Rectangle, 0 if either side not initialized.
     */
    public double getArea()
    {
        double area = length * width;
        return area;
    }
    
    /**
     * Sets both the height and the width of the rectangle.
     * 
     * @param len  The value to assign to the length of the rectangle
     * @param wid  The value to assign the width of the rectangle
     * @return true if both of the entered values are positive, or else returns false.
     */
    public boolean setSides(double len, double wid) {
        length = len;
        width = wid;
        if (length <= 0 || width <= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Gets the diagonal of the rectangle, which is defined as the square root of the length squared added to the width squared, as shown by the Pythagorean Theorem.
     * 
     * @return the double value of the rectangle's diagonal.
     */
    public double getDiagonal() {
        double diag = Math.sqrt(length * length + width * width);
        return diag;
    }
    
    /**
     * Returns the information of the rectangle (length, width, area, diagonal) in a String format.
     * 
     * @return The information as a string.
     */
    public String toString() {
        return "Length: " + getLength() + "\nWidth: " + getWidth() + "\nArea: " + getArea() + "\nDiagonal: " + getDiagonal();
    }
}

