package baekjoon.Q5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N, size;
	static Deque<Integer> dq;
	static StringBuilder sb = new StringBuilder();
	
	static void reverse() {
		
		int[] temp = new int[dq.size()];
		
		for(int i = 0; i < size; i++) {
			temp[i] = dq.peekFirst();
			dq.pollFirst();
		}
		
		for(int j = 0; j < size; j++) {
			dq.addFirst(temp[j]);
		}
		
	}
	
	static void delete() {
		
		if(dq.isEmpty()) {
			sb.append("error\n");
			return;
		} else {
			dq.pollFirst();			
		}

	}
	
	public static void makePrintString(Deque<Integer> dq) {
		
		if(dq.isEmpty()) return;
		
		sb.append('[');
		if(dq.size() > 0) {
			sb.append(dq.pollFirst());
			
			while(!dq.isEmpty()) {
				sb.append(',').append(dq.pollFirst());
			}
		}
		sb.append(']').append('\n');
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String command = br.readLine();
			size = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			dq = new ArrayDeque<Integer>();
			
			for(int j = 0; j < size; j++) {
				dq.add(Integer.parseInt(st.nextToken()));
			}
			
			for(char cmd : command.toCharArray()) {
				
				if(cmd == 'R') {
					reverse();
					continue;
				}else if(cmd == 'D') {
					delete();
					continue;
				}
			}
			
			makePrintString(dq);
		}
		
		System.out.println(sb);
	}
}
