package interview.javaprograms;

public class PrintDuplicatesCharsInString {
	public static void main(String[] args) {
		String str = "hello hai welcome and";
		String a[] = str.split(" ");
		int size = a.length;
		for(int i = 0; i < size; i++) {
			String s = a[i];
			int count = 0;
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < a[i+1].length(); k++) {
					if(a[j] == a[k]) {
						count++;
					}
						
				}
				if(count > 1)
					System.out.println(a[i] + "---"+ count);
			}
		}
	}

}
