package baekjoon.Q4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt1, cnt2 = 0;
	static int cnt3, cnt4 = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			String str = br.readLine();
			boolean vps = false;
			if(str.equals(".")) break;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(') {
					cnt1++;
				} else if (str.charAt(i) == ')') {
					cnt2++;
				
					if(cnt2 > cnt1) {
						vps = false;
						break;
					}
				} else if (str.charAt(i) == '[') {
					cnt3++;
				} else if (str.charAt(i) == ']') {
					cnt4++;
					
					if(cnt4 > cnt3) {
						vps = false;
						break;
					}
				}
			}
			
			if((vps && cnt1 == cnt2) || (vps && cnt3 == cnt4))
				System.out.println("YES");
			else
				System.out.println("NO");
			cnt1 = 0; cnt2 = 0; cnt3 = 0; cnt4 = 0;
			
		}
	}
}
