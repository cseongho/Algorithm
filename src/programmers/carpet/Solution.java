package programmers.carpet;

class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for(int i = 1; i <= area; i++) {
            int row = i;
            int col = area / row;
            
            if(row > col)
                continue;
            if((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            } 
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[] answer = solution(10, 2);
		String temp = "";
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
	}
}
