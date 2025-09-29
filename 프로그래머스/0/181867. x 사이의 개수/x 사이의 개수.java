import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] split = myString.split("x", -1);
        
        for(String s : split) {
            list.add(s.length());
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}