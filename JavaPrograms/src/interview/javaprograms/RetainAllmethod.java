package interview.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllmethod {

	public static void main(String[] args) {
		List list1 = Arrays.asList("banana","Mnago","graps");
		List list2 = Arrays.asList("banana1","Apple","graps1");
		List common = new ArrayList<String>(list1);
		System.out.println(common.retainAll(list2));
	}

}
