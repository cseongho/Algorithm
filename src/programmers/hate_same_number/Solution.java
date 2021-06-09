package programmers.hate_same_number;

import java.util.ArrayList;

public class Solution {
	public static int[] solution(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<>();

		int current = 10;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != current) {
				temp.add(arr[i]);
				current = arr[i];
			}
		}

		int[] answer = new int[temp.size()];

		int size = 0;
		for (int data : temp) {
			answer[size++] = data;
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] arr = { 4,4,4,3,3};

		solution(arr);

	}
}
