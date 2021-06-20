package baekjoon.Q16397;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);
        int G = Integer.parseInt(input[2]);

        bfs(N, T, G);
    }

    public static void bfs(int N, int T, int G) {
        Queue<Pair> queue = new LinkedList<>();
        boolean[] visited = new boolean[100000];
        visited[N] = true;
        queue.add(new Pair(N, 0));

        while(!queue.isEmpty()) {
            Pair temp = queue.poll();
            if(temp.t>T) break;
            if(temp.n==G) {
                System.out.println(temp.t);
                return;
            }

            for(int i=0; i<2; i++) {
                if(i==0) {
                    int nx = temp.n+1;
                    if(nx>99999 || visited[nx]) continue;
                    visited[nx] = true;
                    queue.add(new Pair(nx, temp.t+1));
                }

                else {
                    int nx = temp.n*2;
                    if(nx>99999 || nx==0) continue;

                    int idx = -1;

                    for(int j=1; j<7; j++) {
                        if(nx%(int)Math.pow(10, j)==nx) {
                            idx = j;
                            break;
                        }
                    }

                    if(idx!=-1) {
                        nx -= (int)Math.pow(10, idx-1);
                        if(visited[nx]) continue;
                        visited[nx] = true;
                        queue.add(new Pair(nx, temp.t+1));
                    }
                }
            }
        }
        System.out.println("ANG");
    }

    public static class Pair {
        int n;
        int t;

        public Pair(int n, int t) {
            this.n = n;
            this.t = t;
        }
    }
}
