package baekjoon.Q2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] balloons;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        balloons = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++)
            balloons[i] = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        answer.append(1).append(' ');

        int curr = 0;
        int num = balloons[0];
        balloons[0] = 0;
        
        for (int i = 0; i < N-1; i++) {
            if (num >= 0) {
                for (int j = 0; j < num;) {
                    curr++;
                    curr %= N;
                    if (balloons[curr] != 0)
                        j++;
                }
            } else {
                for (int j = 0; j < num * -1;) {
                    curr--;
                    while (curr < 0)
                        curr += N;
                    if (balloons[curr] != 0)
                        j++;
                }
            }

            num = balloons[curr];
            balloons[curr] = 0;
            answer.append(curr+1).append(' ');
        }

        System.out.print(answer);
    }
}