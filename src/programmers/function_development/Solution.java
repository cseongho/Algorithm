package programmers.function_development;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] workTime_arr = new int[progresses.length];
        
        for(int i=0; i < progresses.length;i++){ 
        	int prog = progresses[i];
        	int workingTime = 0;
        	while(true){
        		if(prog >= 100) break;
        		prog += speeds[i];
        		workingTime++;
        	}
        	workTime_arr[i] = workingTime;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i < workTime_arr.length ; i++){
            int origin = workTime_arr[i];
            int count = 1;
            if(origin < 0) continue;
            for(int j=i+1 ; j < workTime_arr.length ; j++){
            	int compare = workTime_arr[j];
            	if(origin >= compare){
            		workTime_arr[j] = -1;
            		count++;
            	} else break;
            }
            
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
        	answer[i] = list.get(i);
        
        return answer;
    }
}