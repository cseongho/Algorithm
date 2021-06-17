package baekjoon.Q1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N,K;
	static Deque<Integer> dq = new ArrayDeque<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("<");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			dq.offer(i);
		}
		
		while(dq.size() != 0) {
			for(int i = 1; i  < K; i++) {
				int tmp = dq.poll();
				dq.offer(tmp);
			}
			
			if(dq.size()==1)
				sb.append(dq.poll()+"");
			else
				sb.append(dq.poll()+","+" ");
		}
		
		sb.append(">");
		System.out.println(sb);

	}
}
