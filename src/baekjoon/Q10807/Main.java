package baekjoon.Q10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bre.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(bre.readLine(), " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(bre.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == v)
				cnt++;
		}
		bw.write(cnt + "\n");
		bw.flush();
		bre.close();
		bw.close();
	}

}
