package baekjoon.Q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < test; i++) {
			String temp = br.readLine();
			arr.add(temp);
		}
		
		for(String str : arr) {
			StringTokenizer st = new StringTokenizer(str);
			String command = st.nextToken();
			
			if(command.equals("push")) {
				int number = Integer.parseInt(st.nextToken());
				stack.push(number);
				
			} else if (command.equals("pop")) {
				if(stack.empty()) System.out.println("-1"); 
				else System.out.println(stack.pop());

			} else if (command.equals("size")) {
				System.out.println(stack.size());
				
			} else if (command.equals("empty")) {
				if(stack.empty()) System.out.println("1"); 
				else System.out.println("0");
				
			} else if (command.equals("top")) {
				if(stack.empty()) System.out.println("-1"); 
				else System.out.println(stack.lastElement());
				
			} else System.out.println("error");
		}
	}
}
