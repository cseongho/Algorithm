package programmers.unfinished_athlete;

import java.util.Arrays;

public class Solution {
	
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i = 0; i < completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        
        return participant[i];
    }
    
    public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
	}
}
