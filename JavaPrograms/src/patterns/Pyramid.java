package patterns;

public class Pyramid {
	public static void main(String[] args) {
		int n = 3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j > n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
	}
	}

}
