package week1day2;

public class EvenOrNot 
{
static void check(int a)
{
	if (a>0 && a%2==0) 
	{
		System.out.println(a+" is an Even Number");
	}
	else if(a<0)
	{
		System.out.println(a+" is negative number");
	}		
	else if(a==0)
	{
		System.out.println("Provided input is Zero");
	}
	else
	{
		System.out.println(a+" is a odd number");
	}
}
public static void main(String[] args) 
{
	EvenOrNot a = new EvenOrNot();
	a.check(1235678);
}
}
