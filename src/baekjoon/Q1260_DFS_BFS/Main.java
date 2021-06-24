package baekjoon.Q1260_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N,E;
	static int[][] Graph;
	static boolean[] visited;
	
	public static void dfs(int node) {
		visited[node] = true;
    	System.out.print(node + " ");
		
		for(int next = 0; next < N+1; ++next) {
    		if(!visited[next] && Graph[node][next] !=0)
    			dfs(next);
    	}
	}
	
	/* dfs use stack 
	public static void dfs(int node) {
		visited = new boolean[N+1];
    	Stack<Integer> mystack = new Stack<>();
    	mystack.push(node);
    	
    	while (!mystack.empty()) {
    		int curr = mystack.pop();
    		
    		if(visited[curr]) continue;
    		
    		visited[curr] = true;
    		System.out.print(curr + " ");

    		for(int next = 0; next < N+1; next++) {
        		if(!visited[next] && Graph[curr][next] != 0)
        			mystack.push(next);
        	}
    	}
	} */

	public static void bfs(int node) {
		visited = new boolean[N+1];
		
		Queue<Integer> myqueue = new LinkedList<>();
		visited[node] = true;
		myqueue.add(node);
		
		while( !myqueue.isEmpty()) {
			int curr = myqueue.remove();
			
			System.out.print(curr + " ");
			
			for(int next = 0; next < N+1; next++) {
        		if(!visited[next] && Graph[curr][next] !=0) {
        			visited[next] = true;
        			myqueue.add(next);
        		}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		int node = Integer.parseInt(st.nextToken());
		
		Graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			Graph[u][v] = Graph[v][u] = 1;
		}
		dfs(node);
		System.out.println();
		bfs(node);
	}
}
