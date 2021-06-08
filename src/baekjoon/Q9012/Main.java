package baekjoon.Q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<String>();

		for (int i = 0; i < test; i++) {
			arr.add(br.readLine());
		}

		for (String str : arr) {
			boolean vps = true;
			int cnt1 = 0;
			int cnt2 = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == '(') {
					cnt1++;
				} else if (str.charAt(i) == ')') {
					cnt2++;

					if (cnt2 > cnt1) {
						vps = false;
						break;
					}
				}
			}

			if (vps && cnt1 == cnt2)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}
