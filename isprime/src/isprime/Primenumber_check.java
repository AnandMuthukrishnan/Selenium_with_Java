package isprime;

public class Primenumber_check {

	static boolean isprime_check(int a) {
		boolean isprime = true;
		for (int i = 3; i < (a + 1) / 2; i=i+2) 
		{
			if (a % i == 0) {
				isprime = false;
				break;
			} else {
				continue;
			}
		}
		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		Primenumber_check p = new Primenumber_check();
		if(a<=2||a%2!=0)
		{
		if(p.isprime_check(a) == true)
		{
			System.out.println(a+" is a prime number");
		}
		else 
		{
			System.out.println(a+" is not a prime number");
		}
		}
		else 
		{
			System.out.println(a+" is not a prime number");	
		}
	}
}
