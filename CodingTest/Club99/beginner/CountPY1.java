package Club99.beginner;

public class CountPY1 {
    // 프로그래머스 : 문자열 내 p와 y의 개수
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                p++;
            }
            if (c == 'y' || c == 'Y') {
                y++;
            }
        }
        if(p != y) {
            answer = false;
        }

        return answer;
    }
}
