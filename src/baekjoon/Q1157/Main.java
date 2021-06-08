package baekjoon.Q1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String target = br.readLine();
		int[] arr = new int[26];
		int max = -1;
		char answer = '?';

		for (int i = 0; i < target.length(); i++) {
			int index = Character.toLowerCase(target.charAt(i)) - 'a';
			arr[index]++;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer = (char) (i + 65);
			} else if (arr[i] == max)
				answer = '?';
		}
		bw.write(answer);
		bw.flush();
	}
}
