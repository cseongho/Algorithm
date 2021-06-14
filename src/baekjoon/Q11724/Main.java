package baekjoon.Q11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[][] Graph;
	static boolean[] visited;
	static int cnt = 0;
	
	static void bfs(int node) {
		visited[node] = true;
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i] && Graph[node][i] == 1) {
				bfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		Graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			Graph[u][v] = Graph[v][u] = 1;
		}
		
		for(int i = 1; i < N+1; i++) {
			if(!visited[i]) {
				bfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
