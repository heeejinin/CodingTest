import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        for(int i = 0; i < query.length; i++) {
            int idx = query[i];
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, idx + 1);
            } else {
                arr = Arrays.copyOfRange(arr, idx, arr.length);
            }
        }
        
        return arr;
    }
}