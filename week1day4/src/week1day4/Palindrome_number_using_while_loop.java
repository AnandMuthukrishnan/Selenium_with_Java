package week1day4;

public class Palindrome_number_using_while_loop {

	public static void main(String[] args) {
		int a = 121, i = 0, n = 0;
		int b = a;
		while (b > 0) {
			n = b / 10;
			i = (i * 10) + (b % 10);
			b = n;
		}
		System.out.println("User Number : " + a);
		System.out.println("Reversed Number :" + i);
		if (a == i) {
			System.out.println("Number is palyndrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}