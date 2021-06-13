package baekjoon.Q7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N,M,H;
	static int[][][] Board;

	static int[] dy = { 0, 0, -1, 1, 0, 0 };
	static int[] dx = { 0, 0, 0, 0, -1, 1 };
	static int[] dz = { -1, 1, 0, 0, 0, 0 };
	static int cnt, days = 0;
	static Queue<int[]> myqueue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		Board = new int[H][N][M];
		
		for(int k = 0; k < H; k++) {
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
						Board[k][i][j] = Integer.parseInt(st.nextToken());
						if (Board[k][i][j] == 1) myqueue.add(new int[] {k,i,j});
						else if (Board[k][i][j] == 0) cnt++;
				}
			}
		}
		
		while( cnt > 0 && !myqueue.isEmpty()) {
			for(int s = myqueue.size(); s > 0; s --) {
				int[] curr = myqueue.poll();
				
				for(int k = 0; k < 6; k++) {
					int nz = curr[0] + dz[k];
					int ny = curr[1] + dy[k];
					int nx = curr[2] + dx[k];
					
					 if (ny < 0 || nx < 0 || nz < 0 || ny >= N || nx >= M || nz >= H || Board[nz][ny][nx] != 0)
	                        continue;
					 
					 cnt--;
					 Board[nz][ny][nx] = 1;
					 myqueue.add(new int[] {nz, ny, nx});
				}
			}
			days++;
		}
		System.out.println(cnt == 0 ? days : -1);
	
	}
}
