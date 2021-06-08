package baekjoon.Q4458;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] alphabet = new String[N];

		for (int i = 0; i < N; i++) {
			alphabet[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			bw.write(alphabet[i].toUpperCase().charAt(0));
			for (int j = 1; j < alphabet[i].length(); j++) {
				bw.write(alphabet[i].charAt(j));
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
