package Q1357;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int Rev(int x) {
		StringBuilder temp = new StringBuilder(Integer.toString(x));
		String temp1 = temp.reverse().toString();
		x = Integer.parseInt(temp1);
		return x;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String target = br.readLine();
		
		StringTokenizer st = new StringTokenizer(target, " ");
		
		int x = Rev(Integer.parseInt(st.nextToken()));
		int y = Rev(Integer.parseInt(st.nextToken()));
		int result = Rev(x+y);
		
		System.out.println(result);
	}
}
