package baekjoon.Q2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = {"c=","c-" ,"dz=" ,"d-" ,"lj" ,"nj" ,"s=","z="};
		String input = br.readLine();
		
		for(int i = 0; i<str.length; i++) {
			if(input.contains(str[i]))
				input = input.replace(str[i], "?");
		}
		System.out.println(input.length());
	}
}
