package study.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {
		int[] numbers = { 6, 10, 2 };
		
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
		
		
		
		String answer = "";

	}

}
