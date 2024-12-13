package interview.javaprograms;

public class RotateOneChar {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String str = s.substring(1,s.length());
		String op = str+s.charAt(0);
		
		System.out.println(op);
		
	}
}
