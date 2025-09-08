import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>(); // ArrayList를 생성합니다.
        int i = 0; // 변수 i를 초기화합니다.

        while (i < arr.length) {
            if (stk.isEmpty()) { // stk가 비어있는 경우
                stk.add(arr[i]); // arr[i]를 추가합니다.
                i++; // i를 증가시킵니다.
            } else if (arr[i] > stk.get(stk.size() - 1)) { // stk가 비어있지 않고 arr[i]가 마지막 원소보다 큰 경우
                stk.add(arr[i]); // arr[i]를 추가합니다.
                i++; // i를 증가시킵니다.
            } else { // arr[i]가 마지막 원소보다 작거나 같은 경우
                stk.remove(stk.size() - 1); // 마지막 원소를 제거합니다.
                // i를 증가시키지 않고 현재 위치를 유지합니다.
            }
        }

        // ArrayList를 int 배열로 변환하여 반환합니다.
        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        return answer;
    }
}