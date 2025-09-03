import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> numArr = new ArrayList<>();
        
        for(int i = l;i <= r; i++) {
            if(String.valueOf(i).matches("^[05]+")) {
                numArr.add(i);
            }
        } 
        
        int[] answer;
        
        if(numArr.isEmpty()) {
            answer = new int[] { -1 };
        } else {
            answer = new int[numArr.size()];
            
            for(int i = 0; i < numArr.size(); i++) {
            	answer[i] = numArr.get(i);
            }
        }
    
        return answer;
    }
}