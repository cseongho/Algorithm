package baekjoon.Q2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] Board;
	static boolean[][] visited;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1} };
	static int cnt = 0;
	static int max_inarr = 0;

	static void dfs(int r, int c,int height) {
		visited[r][c] = true;
			
		for(int i = 0; i < 4; ++i) {
			int nr = r + D[i][0], nc = c + D[i][1];
			if(nr >= 0 && nc >= 0 && nr < N && nc < N) {
				if(Board[nr][nc] > height && !visited[nr][nc]) 
					dfs(nr,nc,height);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		N = Integer.parseInt(br.readLine());
		Board = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				Board[i][j] = Integer.parseInt(st.nextToken());
				if(max_inarr < Board[i][j]) max_inarr = Board[i][j];
			}
		}
		
		for(int h = 0; h <= max_inarr; h++) {
			cnt = 0;
			for(int i = 0; i< N; i++) {
				for(int j = 0; j < N; j++) {
					if(Board[i][j] > h && !visited[i][j]) {
						dfs(i,j,h);
						cnt++;
					}
				}
			}
			arr.add(cnt);
			visited = new boolean[N][N];
		}
		
		int max = Collections.max(arr);
		System.out.println(max);
		
	}
}
