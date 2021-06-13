package baekjoon.Q2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
	static int N;
	static int[][] Board;
	static boolean[][] visited;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1} };
	static int cnt = 0;
	
	static class Point {
		Point(int r, int c) {
			row = r;
			col = c;
		}
		int row, col;
	}
	
	static void dfs(int r, int c) {
		Stack<Point> mystack = new Stack<>();
		mystack.push(new Point(r, c));
		
		while(!mystack.empty()) {
			Point curr = mystack.pop();
			if (visited[curr.row][curr.col]) continue;
			
			visited[curr.row][curr.col] = true;
			if(Board[curr.row][curr.col] == 1) cnt++;
			
			for(int i = 0; i < 4; ++i) {
				int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
				if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1) continue;
				if(Board[nr][nc] == 0) continue;
				mystack.push(new Point(nr,nc));
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		N = Integer.parseInt(br.readLine());
		Board = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			for(int j = 0; j < N; j++) {
				Board[i][j] = Integer.parseInt(Character.toString(temp.charAt(j)));
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(Board[i][j] == 1 && visited[i][j] == false) {
					cnt = 0;
					dfs(i,j);
					arr.add(cnt);
				}
				
			}
		}
		
		System.out.println(arr.size());
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
