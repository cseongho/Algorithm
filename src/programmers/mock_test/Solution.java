package programmers.mock_test;

import java.util.*;

public class Solution {

	public static int[] solution(int[] answers) {
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int std1_ans = 0;
        int std2_ans = 0;
        int std3_ans = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == std1[ i % 5]) 
                std1_ans++;
            if(answers[i] == std2[i % std2.length]) 
                std2_ans++;
            if(answers[i] == std3[i % 10]) 
                std3_ans++;
        }
        
        int max = Math.max(Math.max(std1_ans,std2_ans), std3_ans);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == std1_ans) list.add(1);
        if(max == std2_ans) list.add(2);
        if(max == std3_ans) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };

		System.out.println(solution(answers));

	}

}

