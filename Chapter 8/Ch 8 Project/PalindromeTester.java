
/**
 * Write a description of class PalindromeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class PalindromeTester
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("String: ");
        String word = keyboard.nextLine();
        boolean check = Palindrome.paliCheck(word, 0);
        System.out.println(check);
    }
}
