package baekjoon.Q2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N,E;
	static int[][] Graph;
	static boolean[] visited;
	static int count = 0;
	
	public static int dfs(int node) {
		visited[node] = true;
    	if(node != 1) count++;
		
		for(int next = 0; next < N+1; ++next) {
    		if(!visited[next] &&Graph[node][next] !=0)
    			dfs(next);
    	}	
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());
		
		Graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < E; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			Graph[u][v] = Graph[v][u] = 1;
		}
		
		System.out.println(dfs(1));
		
	}
}
