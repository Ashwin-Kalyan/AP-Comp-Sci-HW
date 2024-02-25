
/**
 * Defines a triangle with the colors of its sides. 
 *
 * @author Ashwin Kalyan
 * @version 2/1/24
 */
public class Triangle
{
    private int colorLeft;
    private int colorRight;
    private int colorBottom;

    /**
     * Constructor for objects of class Triangle
     * 
     * @param colorLeftInput  Represents the integer that corresponds to the color of the left side of the triangle.
     * @param colorRightInput  Represents the integer that corresponds the color of the right side of the triangle.
     * @param colorBottomInput  Represents the integer that corresponds the color of the bottom side of the triangle.
     */
    public Triangle(int colorLeftInput, int colorRightInput, int colorBottomInput)
    {
        colorLeft = colorLeftInput;
        colorRight = colorRightInput;
        colorBottom = colorBottomInput;
    }

    /**
     * Returns the color of the left side of the triangle.
     *
     * @return  The integer corresponding to the color of the left side of the triangle.
     */
    public int getLeftSide()
    {
       return colorLeft;
    }
    
    /**
     * Returns the color of the right side of the triangle.
     *
     * @return  The integer corresponding to the color of the right side of the triangle.
     */
    public int getRightSide() {
        return colorRight;
    }
    
    /**
     * Returns the color of the bottom side of the triangle.
     *
     * @return  The integer corresponding to the color of the bottom side of the triangle.
     */
    public int getBottomSide() {
        return colorBottom;
    }
    
    /**
     * Compares the colors of the current Triangle object to a different Triangle that is in the same orientation.
     * 
     * @param compareTri  The triangle that is to be compared.
     * @return  True if all of the side colors match, or false if any do not match.
     */
    public boolean compareColors(Triangle compareTri) {
        if (compareTri.getRightSide() == getRightSide() && compareTri.getLeftSide() == getLeftSide() && compareTri.getBottomSide() == getBottomSide()) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Compares the colors of the current Triangle object to a different Triangle that is rotated left.
     * 
     * @param compareTri  The triangle that is to be rotated left and compared to.
     * @return  True if all of the side colors match, or false if any do not match.
     */
    public boolean compareColorsLeft(Triangle compareTri) {
       if (compareTri.getRightSide() == getLeftSide() && compareTri.getBottomSide() == getRightSide() && compareTri.getLeftSide() == getBottomSide()) {
            return true;
       } else {
           return false; 
       }
    }
    
    /**
     * Compares the colors of the current Triangle object to a different Triangle that is rotated right.
     * 
     * @param compareTri  The triangle that is to be rotated right and compared to.
     * @return  True if all of the side colors match, or false if any do not match.
     */
    public boolean compareColorsRight(Triangle compareTri) {
        if (getLeftSide() == compareTri.getBottomSide() && getRightSide() == compareTri.getLeftSide() && getBottomSide() == compareTri.getRightSide()) {
            return true;
        } else {
            return false;
        }
    }
}
