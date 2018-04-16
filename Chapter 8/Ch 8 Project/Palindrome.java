
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static int left = 0;
    public static int right; 
    public static boolean paliCheck(String str)
    {
        right = str.length() - 1; 
        if (left > right)
        {
            return false;
        }
        else
        {
            if (str.charAt(left) == str.charAt(right))
            {
                left--;
                right++;
                paliCheck(str);
            }
            return true;
        }
    }
}