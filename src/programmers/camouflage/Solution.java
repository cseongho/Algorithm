package programmers.camouflage;

import java.util.HashMap;

public class Solution {
	
	
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String[] cloth : clothes) {
			map.put(cloth[1],map.getOrDefault(cloth[1],0) +1);
		}
		
		int answer = 1;
		for(String key : map.keySet()) {
			answer *= map.get(key) + 1;
		}
		
		return answer -1;
	}

	public static void main(String[] args) {
		String[][] clothes = { {"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"} };
		
		System.out.println(solution(clothes));
	}
}
