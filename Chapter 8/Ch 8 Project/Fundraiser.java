

/**
 * Write a description of class Fundraiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundraiser
{
    public static int collect(int monataryGoal)
    {
        System.out.println(monataryGoal);
        int total = 0;
        if(monataryGoal == 1)
        {
            return 1;
        }
        else
        {
            for(int i = 0; i < 10; i++)
            {
                total += collect(monataryGoal/10); //do this for 10; 
            }
            return total + 1;
        }
        
    }
}
