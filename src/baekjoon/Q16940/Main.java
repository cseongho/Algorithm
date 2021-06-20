package baekjoon.Q16940;

import java.io.*;
import java.util.*;

/* https://hongjw1938.tistory.com/130 Âü°í */

public class Main{
    static int n;
    static ArrayList<Integer>[] graph;
    static int[] num; 
    static int[] order;
    static int[] parent;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[n+1];
        for(int i=1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        StringTokenizer st = null;
        for(int i=1; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            graph[v].add(u);
        }
 
        num = new int[n+1];
        order = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i <= n; i++){
            num[i] = Integer.parseInt(st.nextToken());
            order[num[i]] = i;
        }
        
        for(int i=1; i <= n; i++){
            Collections.sort(graph[i], new Comparator<Integer>(){
                public int compare(Integer u, Integer v){
                    if(order[u] < order[v]){
                        return -1;
                    } else if(order[u] == order[v]){
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
        }
        
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n+1];
        
        int idx = 0;
        q.offer(1);
        while(!q.isEmpty()){
            int u = q.poll();
            idx++;
            
            if(num[idx] != u){
                System.out.println(0);
                System.exit(0);
            }
            
            visited[u] = true;
            for(int v : graph[u]){
                if(!visited[v]){
                    q.offer(v);
                }
            }
        }
        
        System.out.println(1);
        br.close();
    }
}

