package pratice.arrays;

public class SearchElement {

	public static void main(String[] args) {
		int[] n = {1,20,15,50,30};
		int key = 10;
		boolean flag = false;
		for(int i = 0; i < n.length; i++) {
			
			if(key == n[i])
				flag = true;
			
		}
		if(flag == true)
			System.out.println(key + " element is present in given array");
		else
			System.out.println("not");
	}

}
