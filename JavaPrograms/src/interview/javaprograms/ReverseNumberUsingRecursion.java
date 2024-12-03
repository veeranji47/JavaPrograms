package interview.javaprograms;

public class ReverseNumberUsingRecursion {

	public static void main(String[] args) {
		String s = "veera";
		reverse(s);
	}
	public static void reverse(String nm) {
		
//		if(a!=0) {
//			i =  (a%10) + (i*10);
//			System.out.println(i);
//			return reverse(a/10, i);
//		}else
//			return i;
		
		if(nm.length()-1 >= 0) {
			System.out.print(nm.charAt(nm.length()-1));
			reverse(nm.substring(0, nm.length()-1));
		}
	}

}
