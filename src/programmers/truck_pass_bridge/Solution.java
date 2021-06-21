package programmers.truck_pass_bridge;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        int current_weight = 0;
        for(int truck : truck_weights)
        {
            while(true){
                if(bridge.isEmpty()){
                    bridge.offer(truck);
                    answer++;
                    current_weight+=truck;
                    break;
                }else if(bridge.size() == bridge_length){
                    current_weight-=bridge.poll();
                }else if(current_weight + truck <= weight){
                    bridge.offer(truck);
                    answer++;
                    current_weight+=truck;
                    break;
                }else{
                    bridge.offer(0);
                    answer++;
                }
            }
        }
        
        return answer + bridge_length;
    }
}

/*

1. Queue<Integer> bridge

2. 다리가 비어있으면, truck 하나의 무게를 올린다.

3. 트럭이 다 지나갔으면, Queue의 크기는 다리의 길이와 같아진다.

   트럭 하나의 무게를 뺀다.

4. 다리가 비어있지 않고, 현재 무게와 트럭 하나의 무게 합이 최대하중보다 작거나 같을 때, 트럭 하나를 올린다.

5. 다리가 비어있지 않고, 무게가 초과될 때 0을 넣는다.
 
*/
