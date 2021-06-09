package programmers.printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static int solution(int[] priorities, int location) {
		int answer = 1;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int temp : priorities) {
			pq.add(temp);
		}

		while (!pq.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == (int) pq.peek()) {
					if (i == location) {
						return answer;
					}
					pq.poll();
					answer++;
				}
			}
		}
	
		return answer;
	}

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 2;

		solution(priorities, location);

	}
}
