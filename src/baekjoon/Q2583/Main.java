package baekjoon.Q2583;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int M, N, K;
	static int count = 0;
	static int[][] Board;
	static int[][] D = { {-1,0}, {1,0}, {0,-1}, {0,1}};
	static ArrayList<Integer> List;
	
	static void dfs(int r, int c) {
		Board[r][c] = 1;
		count++;
		
		for(int i = 0; i < 4; i++) {
			int nr = r + D[i][0];
			int nc = c + D[i][1];
			
			if(nr >= 0 && nc >= 0 && nr < M && nc < N) {
				if(Board[nr][nc] == 0) {
					dfs(nr,nc);
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        Board = new int[M][N];
        
        for(int i = 0; i < K; i++) {
        	st =  new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	
	       for(int a = y1; a < y2; a++) {
	       		for(int b = x1; b < x2; b++) {
	       			Board[a][b] = 1;
	       		}
	       	}
        }	
        	
        List = new ArrayList<Integer>();
        	
        for(int j = 0; j < M; j++) {
        	for(int k = 0; k < N; k++) {
        		if(Board[j][k] == 0) {
        			count = 0;
        			dfs(j,k);
        			List.add(count);
        		}
        	}
        }
        	
        System.out.println(List.size());
        	
        Collections.sort(List);
        	
        for(Integer c : List)
        	System.out.print(c + " ");
        
	}
}
