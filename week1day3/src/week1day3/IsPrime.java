package week1day3;

public class IsPrime {

	public static void main(String[] args) {
		int n = 49;
		boolean isprime = true;
		for (int i = 2; i <= (n - 1); i++) {
			if (n % i == 0) {
				System.out.println(n + " can be divided by least number " + i);
				isprime = false;
				break;
			}
		}
		if (isprime == true) {
			System.out.println(n + " is a Prime NUmber");
		}
	}
}
