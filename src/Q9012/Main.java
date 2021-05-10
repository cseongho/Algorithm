package Q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		
		for(int i = 0; i < test; i++) {
			String temp = br.readLine();
			arr.add(temp);
		}
		
		for(String str : arr) {
			char[] chs = str.toCharArray();

			int cnt1 = 0;
			int cnt2 = 0;
			for(int i = 0; i<chs.length; i++) {
				
				if(chs[i] == '(') cnt1 += 1;
				
				if(chs[i] == ')') cnt2 += 1;
				
			}

			if(cnt1 == cnt2) {
				
				
				System.out.println("YES");
			}
			else System.out.println("NO");
			
		}
	}
}
