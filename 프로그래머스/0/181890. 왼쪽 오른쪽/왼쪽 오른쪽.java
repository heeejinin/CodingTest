import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int lIndex = -1;
        int rIndex = -1;

        // 'l' 또는 'r'의 인덱스 찾기
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                lIndex = i;
                break; // 'l'을 찾으면 반복 중단
            }
            if (str_list[i].equals("r")) {
                rIndex = i;
                break; // 'r'을 찾으면 반복 중단
            }
        }

        // 결과에 따라 배열 자르기
        if (lIndex != -1) {
            // 'l'을 찾은 경우 lIndex 이전까지 자르기
            return Arrays.copyOfRange(str_list, 0, lIndex);
        } else if (rIndex != -1) {
            // 'r'을 찾은 경우 rIndex 이후부터 끝까지 자르기
            return Arrays.copyOfRange(str_list, rIndex + 1, str_list.length);
        } else {
            // 'l'과 'r'이 모두 없는 경우 빈 배열 반환
            return new String[0];
        }
    }
}