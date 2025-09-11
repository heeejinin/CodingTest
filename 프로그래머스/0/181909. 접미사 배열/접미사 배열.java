import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> suffixes = new ArrayList<>();
        
        // 모든 접미사 생성
        for(int i = 0; i < my_string.length(); i++) {
            suffixes.add(my_string.substring(i)); // i부터 끝까지 
        }
        
        // 사전순 정렬
        Collections.sort(suffixes);
        
        return suffixes.toArray(new String[0]);
    }
}