

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
        
        if(monataryGoal == 1)
        {
            return 1;
        }
        else
        {
            return monataryGoal + collect(monataryGoal/10); 
        }
    }
}
