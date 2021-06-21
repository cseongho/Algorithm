package programmers.mock_test;

import java.util.Arrays;

public class Solution {

	public static int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] person1 = { 1, 2, 3, 4, 5 }; // 이만큼씩 반복
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int answer1 = 0, answer2 = 0, answer3 = 0;

		for (int i = 0; i < answer.length; i++) {
			if(person1[i] == answer[i]) answer1++;
			if(person2[i] == answer[i]) answer2++;
			if(person3[i] == answer[i]) answer3++;
		}

		answer[0] = answer1;
		answer[1] = answer2;
		answer[2] = answer3;
		
		Arrays.sort(answer);

		for(int i = 0; i <answer.length; i++) {
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };

		System.out.println(solution(answers));

	}

}

