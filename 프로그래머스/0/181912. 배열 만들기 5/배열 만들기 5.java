import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String numStr : intStrs) {
            int value = Integer.parseInt(numStr.substring(s, s + l));
            
            if(value > k) { 
                list.add(value);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}