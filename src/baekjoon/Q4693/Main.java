package baekjoon.Q4693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int w,h;
	static int[][] Graph;
	static boolean[][] visited;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1}, 
						 {-1,1}, {1,1}, {1,-1}, {-1,-1} };
	static int cnt = 0;
	
	static void bfs(int x, int y) {
		visited[x][y] = true;
		
		int curr_row = x;
		int curr_col = y;
		
		for(int i = 0; i < 8; i++) {
			int nr = curr_row + D[i][0];
			int nc = curr_col + D[i][1];
			if(nr < 0 || nr >= h || nc < 0 || nc >= w) continue;
			if(visited[nr][nc]) continue;
			if(Graph[nr][nc] == 0) continue;
			visited[nr][nc] = true;
			bfs(nr,nc);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if(w == 0 && h == 0) break;
			
			Graph = new int[h][w]; 
			visited = new boolean[h][w];
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					Graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(!visited[i][j] && Graph[i][j] == 1) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
		System.out.println();
		
	}
}
