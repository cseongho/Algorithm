package study.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DFS_Floodfill {
	//DFS Flood Fill
	static final int MAX_N = 10;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1}};
	static int N;
	static int[][] Board = new int[MAX_N][MAX_N];
	static class Point {
		Point(int r, int c) {
			row = r;
			col = c;
		}
		int row, col;
	}
	
	static void dfs(int r, int c, int color) {
		boolean[][] visited = new boolean[MAX_N][MAX_N];
		Stack<Point> mystack = new Stack<>();
		mystack.push(new Point(r, c));
		
		while(!mystack.empty()) {
			Point curr = mystack.pop();
			if (visited[curr.row][curr.col]) continue;
			
			visited[curr.row][curr.col] = true;
			Board[curr.row][curr.col] = color;
			
			for(int i = 0; i < 4; ++i) {
				int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) continue;
				if(Board[nr][nc] == 1) continue;
				mystack.push(new Point(nr,nc));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0; i < N; ++i)
			for(int j=0; j < N; ++j)
				Board[i][j] = sc.nextInt();
		
		int sRow = sc.nextInt(), sCol = sc.nextInt();
		int color = sc.nextInt();
		dfs(sRow, sCol, color);
		
		for(int i = 0; i < N; ++i) {
			for(int j=0; j < N; ++j) {
				System.out.print(Board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/* input
	   5
	   0 0 0 0 0
	   0 0 0 1 1
	   0 0 0 1 0
	   1 1 1 1 0
	   0 0 0 0 0
	   1 1 3
	*/
	
}
