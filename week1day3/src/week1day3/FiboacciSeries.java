package week1day3;
public class FiboacciSeries {

	public static void main(String[] args) 
	{
		int a = 0,b=1;
		int no_of_times=10;
		for (int i = 0;i<no_of_times;i++)
		{
			if (i<2) 
			{
				System.out.println(i);
			}
		    else if(i%2==0)
			{
				a=a+b;
				System.out.println(a);
			}
			else if(i%2 !=0)
			{
				b=a+b;
				System.out.println(b);
			}
		}
		}
	}
