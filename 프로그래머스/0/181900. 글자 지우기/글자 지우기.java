import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        int len = 0;
        
        for(int i : indices) {
            answer.deleteCharAt(i-len);
            len++;
        }
        
        return answer.toString();
    }
}