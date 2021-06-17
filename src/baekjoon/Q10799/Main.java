package baekjoon.Q10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String input;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			if(i+1 == input.length()) break;
			if(input.charAt(i) == '(' && input.charAt(i+1) == ')' ) {
				cnt++;
			}
		}
		
	}
}
