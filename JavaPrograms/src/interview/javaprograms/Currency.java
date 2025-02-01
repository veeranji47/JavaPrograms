package interview.javaprograms;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] currency = {2000,500,200,100,50,20,10,5,2,1};
		
		int amount = 5225;
		
		for(int cur : currency) {
			int count = amount/cur;
			amount%=cur;
			if(count > 0) {
				
				System.out.println(cur + " * " + count);
			}
		}

	}

}
