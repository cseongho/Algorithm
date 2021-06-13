package baekjoon.Q2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[][] Board;
	static boolean[][] visited;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1}};
	
	static class Point {
		int row, col, dist;
		
		Point(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
	}
	
	static int bfs(int sRow, int sCol, int dRow, int dCol) {
		boolean[][] visited = new boolean[N][M];
		Queue<Point> myqueue = new LinkedList<>();
		visited[sRow][sCol] = true;
		myqueue.add(new Point(sRow, sCol, 1));
		
		while(!myqueue.isEmpty()) {
			Point curr = myqueue.remove();
			if (curr.row == dRow && curr.col == dCol)
				return curr.dist;
			
			for (int i = 0; i < 4; ++i) {
				int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > M-1) continue;
				if(visited[nr][nc]) continue;
				if(Board[nr][nc] == 0) continue;
				visited[nr][nc] = true;
				myqueue.add(new Point(nr, nc, curr.dist + 1));
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		Board = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			for(int j = 0; j < M; j++) {
				Board[i][j] = Integer.parseInt(Character.toString(temp.charAt(j)));
			}
		}
		
		System.out.println(bfs(0,0,N-1,M-1));
				
	}
}
