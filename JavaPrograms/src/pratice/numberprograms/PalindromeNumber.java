package pratice.numberprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 1221, a = n, rev = 0;
		while(a > 0) {
			rev = (a%10) + rev * 10;
			a/=10;
		}
		if(rev == n)
			System.out.println(n + " is a palindrome number");
		else
			System.out.println(n + " is not a palindrome");
	}

}
