package algorithm;

import java.util.Stack;

public class ReverseString {
	
	public static String Reverse(String inputString) {
		Stack<String> stack = new Stack<>();
		String returnString = "";
		
		for(int i=0; i<inputString.length(); i++) {
			if(i==inputString.length()-1) {
				stack.push(inputString.substring(i));
			}
			else {				
				stack.push(inputString.substring(i,i+1));
			}
		} // end of for length
		
		for(int i=0; i<inputString.length(); i++) {
			returnString += stack.pop();
		} // end of pop
		
		return returnString;
	}
	
	public static void main(String[] args) {
		String inputString = "Hello World";
		System.out.println(Reverse(inputString));
		
	} // end of main
} // end of class
