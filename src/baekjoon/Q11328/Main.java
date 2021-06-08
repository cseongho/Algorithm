package baekjoon.Q11328;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++) {
			String[] arr = br.readLine().split(" ");
			
			String target1 = arr[0];
			String target2 = arr[1];
			
			int[] alphabat = new int[26];
			boolean isPossible = true;
			
			for(int j = 0; j < target1.length(); j++) {
				alphabat[(int)target1.charAt(j)-'a'] += 1;
			}
			
			for(int j = 0; j < target2.length(); j++) {
				alphabat[(int)target2.charAt(j)-'a'] -= 1;
			}
			
			for (int j = 0; j < alphabat.length; j++) {
				if(alphabat[j] !=0) {
					isPossible = false;
					break;
				}
			}
			
			bw.append(isPossible ? "Possible" : "Impossible");
			bw.newLine();
		}
			bw.flush();
	}
}
