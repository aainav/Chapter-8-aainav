

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
        
        if(monataryGoal == 1)
        {
            return 1;
        }
        else
        {
            return collect(monataryGoal/10) + collect(monataryGoal/10) + collect(monataryGoal/10); //do this for 10; 
        }
    }
}
