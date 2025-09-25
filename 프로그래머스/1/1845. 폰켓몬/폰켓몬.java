import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 중복 제거로 포켓몬 종류 개수 구하기
        Set<Integer> types = new HashSet<>();
        for(int num : nums) {
            types.add(num);
        }
        
        // 포켓몬 종류 개수, 선택 가능한 최대 마리 수 둘 중 작은 값이 답
        return Math.min(types.size(), nums.length / 2);
    }
}