package study.method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//입출력 및 StringTokenizer
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        bw.write(N + " " + M);
		
		//문자열 뒤집기
		String str = "Reverse";
		str = new StringBuilder(str).reverse().toString();
		bw.write(str);

		//문자열 변경
		String name = "starfucks";
		String rename = name.substring(0,4)+'b' + name.substring(5);
		bw.write(rename);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
