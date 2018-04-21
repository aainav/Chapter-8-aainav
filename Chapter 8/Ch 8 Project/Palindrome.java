
/**
 * Write a description of class Palindrome here.
 *
 * Aaina Vannan
 * @version (a version number or a date)
 */
public class Palindrome
{
    //public static int left = 0;
    //public static int right; 
    public static int length; 
    public static boolean paliCheck(String str, int count)
    {
        length = str.length() - 1;
        if (length == count)
        {
            return true;
        }
        else if(str.charAt(count) == str.charAt(length - count))
        {
            return paliCheck(str, count+1);
        }
        else
        {
            return false; 
        }
    }
    /*
     * INPUT...OUTPUT:
     * radar...true
     * abcd...false
     */
}