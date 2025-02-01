package interview.javaprograms;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp = "{([]}";
		Stack<Character> stack = new Stack<Character>();
		for(char c:exp.toCharArray()) {
			if(c == '(' || c=='[' || c=='{') {
				stack.push(c);
			}else if(stack.isEmpty() ||
					c == ')' && stack.pop()!='(' ||
					c == ']' && stack.pop()!='[' ||
					c == '}' && stack.pop()!='{'){
						System.out.println("not balanced :(  ");
						return ;
					}
		}
		
		System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced" );
	

	}

}
