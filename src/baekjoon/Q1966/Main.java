package baekjoon.Q1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int t;
	static int N,M;
	static int[] priorities;
	
	public static int solution(int[] priorities, int location) {
		int answer = 1;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int temp : priorities) {
			pq.add(temp);
		}

		while (!pq.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == (int) pq.peek()) {
					if (i == location) {
						return answer;
					}
					pq.poll();
					answer++;
				}
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			priorities = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				priorities[j] = Integer.parseInt(st.nextToken());
			}
			System.out.println(solution(priorities, M));
		}
	}
	
	
}
