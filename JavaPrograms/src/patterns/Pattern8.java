package patterns;

public class Pattern8 {
	 public static void main(String[] args) {
	        int n = 4,count=1;
	        for(int i=1;i<=n;i++){
	            for(int j=n;j>=i;j--){
	               System.out.print(count+" ");
	                count++;   
	            }
	            System.out.println();
	        }
	 }

}
