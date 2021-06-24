package programmers.network;

class Solution {
    public static void dfs(int node, boolean[] visited, int[][] computers) {
        visited[node] = true;
        
        for(int next = 0; next < computers.length; next++) {
            if(!visited[next] && computers[node][next] != 0){
                dfs(next, visited, computers);
            }
        }
    }
    
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        
        for(int i = 0; i < n; i++) {
            visited[i] = false;
        }
        
        for(int i = 0; i < computers.length; i++) {
            if(visited[i] == false) {
                answer++;
                dfs(i, visited, computers);
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[][] computers = { {1,1,0}, {1,1,0}, {0,0,1}};
		int n = 3;
		System.out.println(solution(n, computers));
	}
}