import java.util.Scanner;
/**
 * This class gives how many values were entered,the highest value, and the average.
 *
 * @author (Hitayshi Shah)
 * @version (April 4, 2020)
 */
public class ElevationProcessor
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sea level elevation or Q to quit: ");
        double elev = 0;
        int total = 0;
        int pos = 0;
        double sum= 0;
        
        if (!in.hasNextDouble())
        {
            System.out.println("No elevation values entered.");
        }
        else 
        {
            System.out.print("Enter the sea level elevation or Q to quit: ");
            double max = in.nextDouble();
            total++;
            sum = sum + max;
            if (max > 0)
            {
                pos++;
            }
            while (in.hasNextDouble())
            {   
                System.out.print("Enter the sea level elevation or Q to quit: ");
                elev = in.nextDouble();
                total++;
                sum = sum + elev;
                
                if (elev > 0)
                {
                    pos++;
                }
                if (elev > max)
                {
                    max = elev;
                }
            }
            if (total == 1 && pos==1)
            {
                System.out.println("There is one elevation value and one of them is above the sea level.");
            }
            else
            {
                System.out.println("There are " + total + " elevation values and " + pos +" of them are above the sea level.");
            }
            
            System.out.printf("The highest elevation is %.2f", max);
            System.out.print(".");
            System.out.println();
            System.out.printf("The average elevation is %.2f", sum/total);
            System.out.print(".");
         
        }
        
    }

}
