import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 쿼리의 개수만큼 결과 배열 초기화
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0]; // 쿼리의 시작 인덱스
            int e = queries[i][1]; // 쿼리의 끝 인덱스
            int k = queries[i][2]; // 쿼리 값
            
            int result = -1; // 기본값으로 -1 설정
            
            // s부터 e까지의 arr 배열 구간을 순회
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) { // k보다 큰 수를 찾음
                    if (result == -1 || arr[j] < result) {
                        result = arr[j]; // 가장 작은 수를 result에 저장
                    }
                }
            }
            answer[i] = result; // 결과 배열에 저장
        }
        
        return answer;
    }
}