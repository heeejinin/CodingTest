package Club99.beginner;


import java.util.HashSet;

public class Main10 {
    public int solution(int[] nums) {
        // 1. 중복 없는 폰켓몬 종류의 개수를 구하기 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 2. 최대 선택 가능한 폰켓몬 수 계산
        int maxSelect = nums.length / 2;

        // 3. 결과는 폰켓몬 종류 수와 maxSelect 중 작은 값을 반환
        return Math.min(set.size(), maxSelect);
    }
}
