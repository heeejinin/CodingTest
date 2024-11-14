package Club99.beginner;

import java.util.*;

public class Main15 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int previous = -1;  // 초기값으로 배열에 포함되지 않은 값 설정

        for (int num : arr) {
            if (num != previous) {  // 이전 값과 다른 경우에만 추가
                list.add(num);
                previous = num;
            }
        }

        // ArrayList를 int[] 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}