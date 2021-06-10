package study.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import study.algorithm.DFS_Floodfill.Point;

public class BFS_ShortestPath {
	//BFS Shortest Path
	static final int MAX_N = 10;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1}};
	static int N;
	static int[][] Board = new int[MAX_N][MAX_N];
	
	static class Point {
		Point(int r, int c, int d) {
			row = r;
			col = c;
			dist = d;
		}
		int row, col, dist;
	}
	
	static int bfs(int sRow, int sCol, int dRow, int dCol) {
		boolean[][] visited = new boolean[MAX_N][MAX_N];
		Queue<Point> myqueue = new LinkedList<>();
		visited[sRow][sCol] = true;
		myqueue.add(new Point(sRow, sCol, 0));
		
		while(!myqueue.isEmpty()) {
			Point curr = myqueue.remove();
			if (curr.row == dRow && curr.col == dCol)
				return curr.dist;
			
			for (int i = 0; i < 4; ++i) {
				int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) continue;
				if(visited[nr][nc]) continue;
				if(Board[nr][nc] == 1) continue;
				visited[nr][nc] = true;
				myqueue.add(new Point(nr, nc, curr.dist + 1));
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0; i < N; ++i)
			for(int j=0; j < N; ++j)
				Board[i][j] = sc.nextInt();
		
		int sRow, sCol, dRow, dCol;
		sRow = sc.nextInt();
		sCol = sc.nextInt();
		dRow = sc.nextInt();
		dCol = sc.nextInt();
		System.out.println(bfs(sRow,sCol,dRow,dCol));
	}
	
	/* input 
	   5
	   0 0 0 0 0
	   0 1 1 1 1
	   0 0 0 0 0
	   1 1 1 1 0
	   0 0 0 0 0
	   0 1 4 2
	 */
}
