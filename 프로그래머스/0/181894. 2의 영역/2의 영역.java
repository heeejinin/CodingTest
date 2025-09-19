import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;

        // 2의 마지막 인덱스 찾기
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastIndex = i;
                break;
            }
        }

        // 2가 없을 경우
        if (lastIndex == -1) {
            return new int[]{-1};
        }

        // 2의 첫 번째 인덱스 찾기
        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }

        // 부분 배열 생성
        List<Integer> resultList = new ArrayList<>();
        for (int i = firstIndex; i <= lastIndex; i++) {
            resultList.add(arr[i]);
        }

        // List를 int[]로 변환하여 반환
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}