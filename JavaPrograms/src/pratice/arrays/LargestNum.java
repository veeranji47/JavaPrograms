package pratice.arrays;

public class LargestNum {

	public static void main(String[] args) {
		int[] n = {1,20,15,50,30};
		int l = n[0];
		for(int i = 0; i < n.length; i++) {
			if(l < n[i])
				l = n[i];
		}
		System.out.println(l);

	}

}
