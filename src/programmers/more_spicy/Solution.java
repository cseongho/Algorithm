package programmers.more_spicy;

import java.util.PriorityQueue;

class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
       
        PriorityQueue<Integer> heap = new PriorityQueue();
        
        for(int ascoville : scoville) {
            heap.offer(ascoville);
        }
        
        while(heap.peek() <= K) {
            if(heap.size() == 1) return -1;
            
            int first = heap.poll();
            int second = heap.poll();
            heap.offer(first + (second * 2));    
            answer++; 
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] scoville = {1, 2, 3, 9, 10, 12};
    	
    	System.out.println(solution(scoville, 7));
	}
}