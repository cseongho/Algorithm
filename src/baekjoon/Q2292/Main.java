package baekjoon.Q2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int layer = 1;
		int num = 0;
		int totalNum = 1;
		
		while (true) {
			if (input <= totalNum)
				break;
			else {
				num += 6;
				totalNum+=num;
				layer++;
			}
		}
		
		System.out.println(layer);
	}
}
