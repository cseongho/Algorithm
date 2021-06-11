package baekjoon.Q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static int comp_w(Character[][] arr) {
		int count = 0;
		Character[][] comp_arr = new Character[8][8];
	
		comp_arr[0][0] = 'W';
		Character prev = 'W';
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(j == 0 && i == 0) continue;
				if(prev == 'W') {
					comp_arr[i][j] = 'B';
					prev = comp_arr[i][j];
				} else {
					comp_arr[i][j] = 'W';
					prev = comp_arr[i][j];
				}
			}
			if(i % 2 == 0) prev = 'W';
			else prev = 'B';
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if( arr[i][j] != comp_arr[i][j]) count++;
			}
		}
		
		return count;
	}
	
	public static int comp_b(Character[][] arr) {
		int count = 0;
		Character[][] comp_arr = new Character[8][8];
	
		comp_arr[0][0] = 'B';
		Character prev = 'B';
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(j == 0 && i == 0) continue;
				if(prev == 'B') {
					comp_arr[i][j] = 'W';
					prev = comp_arr[i][j];
				} else {
					comp_arr[i][j] = 'B';
					prev = comp_arr[i][j];
				}
			}
			if(i % 2 == 0) prev = 'B';
			else prev = 'W';
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if( arr[i][j] != comp_arr[i][j]) count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		Character[][] arr = new Character[r][c];
		Character[][] temp_arr = new Character[8][8];
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < r; i++) {
			String temp = br.readLine();
			for (int j = 0; j < c; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}
		
		if(r > 8 && c <= 8 ) {
			for(int k = 0; k < r - 8; k++) {
				for (int i = 0 + k; i < 8 + k; i++) {
					for (int j = 0; j < 8; j++) {
						temp_arr[i][j] = arr[i][j];
					}
				}
			}
			list.add(comp_b(temp_arr));
			list.add(comp_w(temp_arr));
			
		} else if (c > 8 && r <= 8) {
			for(int k = 0; k < c - 8; k++) {
				for (int i = 0; i < 8; i++) {
					for (int j= 0 + k; j < 8 + k; j++) {
						temp_arr[i][j] = arr[i][j];
					}
				}
			}
			list.add(comp_b(temp_arr));
			list.add(comp_w(temp_arr));
		} else if (c > 8 && r > 8) {
			for(int k = 0; k < c - 8; k++) {
				for (int i = 0; i < 8; i++) {
					for (int j= 0 + k; j < 8 + k; j++) {
						temp_arr[i][j] = arr[i][j];
					}
				}
			}
			list.add(comp_b(temp_arr));
			list.add(comp_w(temp_arr));
			
			for(int k = 0; k < r - 8; k++) {
				for (int i = 0 + k; i < 8 + k; i++) {
					for (int j = 0; j < 8; j++) {
						temp_arr[i][j] = arr[i][j];
					}
				}
			}
			list.add(comp_b(temp_arr));
			list.add(comp_w(temp_arr));
		}
	

	}
}
