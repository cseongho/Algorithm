package programmers.travel_paths;

import java.util.*;

class Solution {
    static ArrayList<String> list;
    static boolean[] visited;
    
    public static String[] solution(String[][] tickets) {
        list = new ArrayList<>();
        visited = new boolean[tickets.length];
        
        backtracking("ICN", 0, "ICN",tickets);
        Collections.sort(list);
        String[] result = list.get(0).split(" ");
        return result;
    }
    
    public static void backtracking(String s, int idx, String result, String[][] tickets) {
        if(idx == tickets.length) {
            list.add(result);
            return;
        }
        
        for(int i = 0; i < tickets.length; i++) {
            if(visited[i] == false && tickets[i][0].equals(s)) {
                visited[i] = true;
                backtracking(tickets[i][1], idx + 1, result + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
    	String[][] tickets = { {"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
    	String[] result = solution(tickets);
    	
    	for(int i = 0; i < result.length; i++) {
    		System.out.print(result[i]);
    	}
	}
}