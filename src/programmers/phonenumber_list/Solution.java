package programmers.phonenumber_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	static ArrayList<String> arr = new ArrayList<String>();
	
	public static boolean solution(String[] phone_book) {
        
		Arrays.sort(phone_book);
		
		int length = phone_book.length;
		
        for(int i = 0; i < length - 1; i++) {
        		if(phone_book[i+1].startsWith(phone_book[i]))
        			return false;
        }

        return true;
    }
	
	public static void main(String[] args) {
		String[] phone_book = { "123","456","789" };
		
		System.out.println(solution(phone_book));
	}
}
