package programmers.H_Index;

import java.util.*;

public class Solution {
	public static int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        Integer[] n_citations = new Integer[length];
        
        for(int i = 0; i < length; i++) {
            n_citations[i] = citations[i];
        }
        
        Arrays.sort(n_citations, Comparator.reverseOrder());
        
        for(int i = n_citations[0]; i >= 0; i--) {
            int cnt = 0;
            for(int j = 0; j < length; j++) {
                if(i <= n_citations[j]) cnt++;
            }
            
            if(cnt >= i) {
                answer = i;
                return answer;
            }
        }
        
        return answer;
        
    }
	
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
	
		System.out.println(solution(citations));
		
	}
}
