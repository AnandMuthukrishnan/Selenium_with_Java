package week1day4;
import java.util.Arrays;
public class FindDup 
{
    public static void main(String[] args) 
    {
    	  PrintDuplicates pd = new PrintDuplicates();
    	  int[] num = pd.num;
    	Arrays.sort(num);
        System.out.println("Duplicate values in the array are:");
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                System.out.println(num[i]);
            }
        }
    }
}