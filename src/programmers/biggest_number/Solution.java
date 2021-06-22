package programmers.biggest_number;

import java.util.*;

public class Solution {
	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] sarr = new String[numbers.length];
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(sarr, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return (str2 + str1).compareTo(str1 + str2);
			}
		});
		
		return sarr[0].equals("0") ? sarr[0] : String.join("", sarr);
    }
	
	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		
		System.out.println(solution(numbers));
	}
}
