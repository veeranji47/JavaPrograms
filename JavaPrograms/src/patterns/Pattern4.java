package patterns;

public class Pattern4 {
	  public static void main(String[] args) {
	        int n = 4,count=1;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i<=j)
	                    System.out.print("* ");
	                else
	                    System.out.print("  ");
	            }
	            System.out.println();
	        }
	    }
}
