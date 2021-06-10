package baekjoon.Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < N; i++) {
			arr.add(br.readLine());
		}
		
		for(int i = 0; i < N; i++) {
			if(check(arr.get(i)) == true) count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean check(String str) {
		boolean[] arr = new boolean[26];
		int prev = 0;
		
		for (int i = 0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(arr[now-'a'] == false) {
					arr[now-'a'] = true;
					prev = now;
				} else return false;
			} else continue;
		}
		return true;
	}
}
