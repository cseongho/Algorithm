package baekjoon.Q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'C') 
				count += 3;
			 else if (input.charAt(i) >= 'D' && input.charAt(i) <= 'F') 
				count += 4;
			 else if (input.charAt(i) >= 'G' && input.charAt(i) <= 'I') 
				count += 5;
			 else if (input.charAt(i) >= 'J' && input.charAt(i) <= 'L') 
				count += 6;
			 else if (input.charAt(i) >= 'M' && input.charAt(i) <= 'O') 
				count += 7;
			 else if (input.charAt(i) >= 'P' && input.charAt(i) <= 'S') 
				count += 8;
			 else if (input.charAt(i) >= 'T' && input.charAt(i) <= 'V') 
				count += 9;
			 else if (input.charAt(i) >= 'W' && input.charAt(i) <= 'Z') 
				count += 10;
		}
		
		System.out.println(count);
	}
}
