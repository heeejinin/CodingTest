import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 기존 배열을 크기 +1로 복사
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        answer[num_list.length] = last > secondLast ? last - secondLast : last * 2;
        
        return answer;
    }
}