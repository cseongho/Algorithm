package baekjoon.Q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Deque<Integer> dq = new ArrayDeque<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		while(N--> 0) {
			st = new StringTokenizer(br.readLine());
			String temp = st.nextToken();
			switch (temp) {
			case "push_front":
				dq.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.offerLast(Integer.parseInt(st.nextToken()));				
				break;
			case "pop_front":
				if(!dq.isEmpty()) {
					System.out.println(dq.pollFirst());
				}
				else System.out.println(-1);
				break;
			case "pop_back":
				if(!dq.isEmpty()) {
					System.out.println(dq.pollLast());
				}
				else System.out.println(-1);
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if(dq.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(dq.isEmpty()) System.out.println(-1);
				else System.out.println(dq.peekFirst());
				break;
			case "back":
				if(dq.isEmpty()) System.out.println(-1);
				else System.out.println(dq.peekLast());
				break;
			}
		}
	}
}
