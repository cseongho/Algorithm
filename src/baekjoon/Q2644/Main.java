package baekjoon.Q2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N,E;
	static int target1,target2;
	static int[][] Graph;
	static boolean[] visited;
	static int[] count;
	
	static void bfs(int node) {
		Queue<Integer> myqueue = new LinkedList<>();
		visited[node] = true;
		myqueue.add(node);
		
		while( !myqueue.isEmpty()) {
			int curr = myqueue.poll();
			
			if(curr == target2) break;
			
			for(int next = 0; next < Graph.length; next++) {
				if(Graph[curr][next] == 1 && visited[next] == false) {
					visited[next] = true;
					myqueue.add(next);
					count[next] = count[curr] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		visited = new boolean[N+1];
		count = new int[N+1];
		Graph = new int[N+1][N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		target1 = Integer.parseInt(st.nextToken());
		target2 = Integer.parseInt(st.nextToken());
		
		E = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			Graph[u][v] = Graph[v][u] = 1;
		}
		
		bfs(target1);
		
		if(count[target2] == 0) System.out.println(-1);
		else System.out.println(count[target2]);
	}
}
