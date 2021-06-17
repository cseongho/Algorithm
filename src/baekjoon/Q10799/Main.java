package baekjoon.Q10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import javax.security.sasl.SaslException;

public class Main {
	static String input;
	static int result = 0;
	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		input = br.readLine();
		int length = input.length();
		
		for(int i = 0; i < length; i++) {
			if(input.charAt(i) == '(') {
				stack.push('(');
				continue;
			}
			
			if(input.charAt(i) == ')' ) {
				stack.pop();
				
				if(input.charAt(i - 1) == '(') {
					result += stack.size();
				} else {
					result++;
				}
				
			}
		}
		System.out.println(result);
		
	}
}
