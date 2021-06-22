package study.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {		
		int[] numbers = {6,10,2};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			StringBuilder sb = new StringBuilder();
			String prefix = Integer.toString(numbers[i]);
			sb.append(prefix);
			
			for(int j = numbers.length - 1; j >= 0; j--) {
				if(i == j) continue;
				sb.append(Integer.toString(numbers[j]));
			}
			arr.add(Integer.parseInt(sb.toString()));
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
