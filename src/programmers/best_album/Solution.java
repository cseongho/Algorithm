package programmers.best_album;

import java.util.*;

public class Solution {
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
//        Arrays.sort(genres);
//        Arrays.sort(plays);
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        String[] temp = new String[map.size()];
        for(String key : map.keySet()) {
        	
        }
        
        
        
        System.out.println(map.toString());
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop"};
		int[] plays = { 500, 600, 150, 800, 2500};
		
		solution(genres, plays);
	}
}
