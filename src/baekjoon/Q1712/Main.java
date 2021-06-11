package baekjoon.Q1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //고정비용
		int B = Integer.parseInt(st.nextToken()); //가변비용(재료비)
		int C = Integer.parseInt(st.nextToken()); //노트북가격
		
		if ( C <= B) {
			System.out.println("-1");
		}
		else {
			System.out.println((A/(C-B))+1);
		}
	
	}
}
