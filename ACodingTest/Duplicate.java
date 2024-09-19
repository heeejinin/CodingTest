package ACodingTest;

import java.util.LinkedList;

public class Duplicate {
    public LinkedList<Integer> solution(int[] nums) {
        LinkedList<Integer> answer = new LinkedList();
        answer.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                answer.offerFirst(nums[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Duplicate T = new Duplicate();
        System.out.println(T.solution(new int[]{0, 1, 1, 1, 2, 2, 2, 3}));
        System.out.println(T.solution(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5}));
        System.out.println(T.solution(new int[]{0, 0, 0, 3, 3, 3, 5, 7, 7, 7}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9}));
    }
}
