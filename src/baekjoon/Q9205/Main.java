package baekjoon.Q9205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
	static int t,b;
	static int[][] s;
	static int[][] c;
	static int[][] d;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		s = new int[2][0];
		
		
		for(int i = 0; i < t; i++) {
			b = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			s[i][0] = Integer.parseInt(st.nextToken());
			for(int j = 0; j < b; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				c[j][0] = Integer.parseInt(st2.nextToken());
			}
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			d[i][0] = Integer.parseInt(st3.nextToken()); 
		}
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < b; j++) {

			}
		}
		

	}
}
