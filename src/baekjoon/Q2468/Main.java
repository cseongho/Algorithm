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
	
	static class Point {
		Point(int r, int c) {
			row = r;
			col = c;
		}
		int row, col;
	}
	
	static int dfs(int height) {
		Stack<Point> mystack = new Stack<>();
		mystack.push(new Point(0, 0));
		int cnt = 0;
		
		while(!mystack.empty()) {
			Point curr = mystack.pop();
			if (visited[curr.row][curr.col]) continue;
			
			visited[curr.row][curr.col] = true;
			if(Board[curr.row][curr.col] > height) cnt++;
			
			for(int i = 0; i < 4; ++i) {
				int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) continue;
				if(Board[nr][nc] == 0) continue;
				mystack.push(new Point(nr,nc));
			}
		}
		return cnt;
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
			}
		}
		
		for(int i = 1; i <= 100; i++) {
			arr.add(dfs(i));
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr.get(0));
		
	}
}
