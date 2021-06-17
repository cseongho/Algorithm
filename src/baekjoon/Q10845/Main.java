package baekjoon.Q10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static List<Integer> que =new ArrayList<>();
	
    public static void main(String[] args) throws IOException {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        N = Integer.parseInt(br.readLine()); 
        
        while(N-- > 0) {
            st= new StringTokenizer(br.readLine());
            String temp =st.nextToken();
            switch(temp) {
                case "push":
                    que.add(Integer.parseInt(st.nextToken()));                
                    break;
                case "pop":    
                    if(!que.isEmpty()) {
                    	bw.write(que.get(0));
                    	que.remove(0);
                    }
                    else bw.write(-1);
                    break;
                case "size":
                	bw.write(que.size());
                    break;
                case "empty":
                    if(que.isEmpty()) bw.write(-1);
                    else bw.write(0);
                    break;
                case "front":
                    if(que.isEmpty()) bw.write(-1);
                    else bw.write(que.get(0));
                    break;
                case "back":
                    if(que.isEmpty()) bw.write(-1);
                    else bw.write(que.get(que.size()-1));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
