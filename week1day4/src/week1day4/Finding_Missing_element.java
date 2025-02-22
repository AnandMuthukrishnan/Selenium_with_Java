package week1day4;
import java.util.Arrays;

public class Finding_Missing_element {
	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 2, 8, 6, 7, 19,20,100 };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > 1) 
			{
				if(a[i+1]-a[i] == 2)
				{
				System.out.println (a[i]+1);
				}
				else if(a[i+1]-a[i]>2)
				{
					for(int y =a[i];y<a[i+1];y++)
					{
						System.out.println(y);
					}
					
				}
			}
		}
	}
}
