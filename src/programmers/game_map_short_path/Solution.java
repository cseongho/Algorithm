package programmers.game_map_short_path;

import java.util.*;

class Solution {
    static int n,m;
    static int[][] D = { {-1,0} , {1,0} , {0,-1} , {0,1}};
    
    static class Point {
        int row, col, dist;
        
        Point(int r, int c, int d){
            row = r;
            col = c;
            dist = d;
        }
    }
    
    static int bfs(int x, int y, int[][] maps) {
        boolean[][] visited = new boolean[n][m];
        Queue<Point> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new Point(x,y,1));
        
        while(!q.isEmpty()) {
            Point curr = q.remove();
            if(curr.row == n -1 && curr.col == m - 1) return curr.dist;
            
            for(int i = 0; i < 4; i++) {
                int nr = curr.row + D[i][0];
                int nc = curr.col + D[i][1];
                
                if(nr < 0 || nr > n - 1 || nc < 0 || nc > m - 1) continue;
                if(visited[nr][nc]) continue;
                if(maps[nr][nc] == 0) continue;
                visited[nr][nc] = true;
                q.add(new Point(nr,nc,curr.dist + 1));
            }
            
        }
        return -1;
        
    }
    
    public static int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        answer = bfs(0,0,maps);
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[][] maps = { {1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1} };
		System.out.println(solution(maps));
	}
}