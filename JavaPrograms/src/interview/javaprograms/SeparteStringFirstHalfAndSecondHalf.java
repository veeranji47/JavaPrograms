package interview.javaprograms;

public class SeparteStringFirstHalfAndSecondHalf {

	public static void main(String[] args) {
		String str = "Welcome to the hyderebad";
		String firstHalf = str.substring(0, str.length()/2);
		String secHalf = str.substring(firstHalf.length(), str.length());
		System.out.println("First half : "+firstHalf + "\n" + "Second half : "+secHalf);

	}

}
