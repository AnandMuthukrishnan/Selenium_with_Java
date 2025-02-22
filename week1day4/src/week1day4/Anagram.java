package week1day4;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) 
    {
        String text1 = "stops";
        String text2 = "potss";
        char[] text11 = text1.toCharArray();
        char[] text22 = text2.toCharArray();
        
        Arrays.sort(text11);
        Arrays.sort(text22);
        
        if (Arrays.equals(text11, text22))
        {
            System.out.println("Matching");
        }
        else
        {
            System.out.println("Not Matching");
        }
    }
}
