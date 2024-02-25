
/**
 * Solutions to wksht 3.3
 *
 * @author Ashwin Kalyan
 * @version 2-13-24
 */
public class MainSports
{
    public static void main(String[] args)
    {
        SportsTeam greenBay = new Football("Packers", 16, 10, 6, 0, 51, 8);  // numbers are out of order

        SportsTeam minnesota = new Baseball("Twins", 162, 59, 103, 0, 200, 690, 126); // numbers are out of order

        System.out.println(greenBay.toString());

        System.out.print("\n\n" + minnesota.toString());

    }
}