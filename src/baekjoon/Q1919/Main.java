package baekjoon.Q1919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String target1 = br.readLine();
		String target2 = br.readLine();
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		int cnt = 0;
		
		for(int i=0; i<target1.length(); i++) 
			arr1[target1.charAt(i)-'a'] ++;
		
		for(int i=0; i<target2.length(); i++) 
			arr2[target2.charAt(i)-'a'] ++;
		
		for(int i=0; i<26; i++) {
			if(arr1[i] != arr2[i]) cnt += Math.abs(arr1[i] - arr2[i]);
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
	}
}
