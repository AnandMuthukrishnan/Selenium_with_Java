package week1day4;

public class Palindrome_Number_Using_for_Loop {
	public static void main(String[] args) {
		int a = 12321;
		int i = 0;
		for (int b = a; b > 0; b = b / 10) {
			i = (i * 10) + (b % 10);
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