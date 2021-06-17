package baekjoon.Q1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int cnt = 0;
	static int[] location;
	static LinkedList<Integer> dq = new LinkedList<Integer>();
	
	static void op1() {
		dq.pollFirst();
	}
	
	static void left_shift() {
		int temp = dq.peekFirst();
		dq.pollFirst();
		dq.addLast(temp);
	}
	
	static void right_shift() {
		int temp = dq.peekLast();
		dq.pollLast();
		dq.addFirst(temp);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		location = new int[M];
		
		for(int i = 1; i <= N; i++) {
			dq.add(i);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			location[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i = 0; i < M; i++) {
			int target_idx = dq.indexOf(location[i]);
			int half_idx;
			
			if(dq.size() % 2 == 0) half_idx = dq.size() / 2 - 1;
			else half_idx = dq.size() / 2;
			
			if(target_idx <= half_idx) {
				
				for(int j = 0; j < target_idx; j++) {
					left_shift();
					cnt++;
				}
			} else {
				for(int j = 0; j < dq.size() - target_idx; j++) {
					right_shift();
					cnt++;
				}
			}
			op1();
		}
		
		System.out.println(cnt);
		
	}
}
