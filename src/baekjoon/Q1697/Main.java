package baekjoon.Q1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int s,d;
	static int[] visited = new int[100001];
	
	static void bfs() {
		Queue<Integer> myqueue = new LinkedList<>();
		myqueue.add(s);
		
		while(!myqueue.isEmpty()) {
			int n = myqueue.poll();
			if(n == d) break;
			if(n > 0 && visited[n-1] == 0) {
				myqueue.add(n-1);
				visited[n-1] = visited[n] + 1;
			}
			if(n < 100000 && visited[n+1] == 0) {
				myqueue.add(n+1);
				visited[n+1] = visited[n] + 1;
			}
			if(n*2 <= 100000 && visited[n*2] == 0){
	            myqueue.add(n*2);
	            visited[n*2] = visited[n] + 1;
	        }
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		s = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		bfs();
		System.out.println(visited[d]);
	}
}
