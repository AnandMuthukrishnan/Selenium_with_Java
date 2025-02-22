package week1day4;

public class Odd_Index_to_Upper_Case {

	public static void main(String[] args) 
	{
		String test = "changeme";
		char[] chararray = test.toCharArray();
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0)
			{
				chararray[i] = Character.toUpperCase(chararray[i]);
			}
		}
		System.out.println(chararray);
	}
}
