package baekjoon.Q1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static int N;
	static Double[] operand;
	static char[] inputVal;
	static Stack<Double> stack = new Stack<>(); 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		operand = new Double[N];
		inputVal = br.readLine().toCharArray();
		int length = inputVal.length;
		
		for(int i=0; i<N; i++) {
			operand[i] = Double.parseDouble(br.readLine());
		}
		for(int i = 0; i < length; i++) {
			if(Character.isAlphabetic(inputVal[i])) {
				int index = (int)inputVal[i]-65;
				stack.push(operand[index]);
			}else {
				Double result = 0.d;
				Double pop1 = stack.pop();
				Double pop2 = stack.pop();
				if(inputVal[i]=='+') {
					result = pop2 + pop1;
				}
				if(inputVal[i]=='-') {
					result = pop2 - pop1;
				}
				if(inputVal[i]=='*') {
					result = pop2 * pop1;
				}
				if(inputVal[i]=='/') {
					result = pop2 / pop1;
				}
				stack.push(result);
			}
		}
		System.out.format("%.2f", stack.pop());
	}
}
