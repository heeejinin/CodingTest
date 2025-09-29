import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] split = myString.split("x");
        
        List<String> strings = new ArrayList<>();
        
        for (String s : split) {
            if (!s.isEmpty()) {
                strings.add(s);
            }
        }
        
        String[] answer = strings.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}