import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] dice = {a, b, c, d};
        Arrays.sort(dice); // 오름차순 정렬
        
        if(dice[0] == dice[3]) {
            // 모든 주사위 값이 같은 경우
            answer = 1111 * dice[0];
        } else if(dice[0] == dice[2] || dice[1] == dice[3]) {
            // 3개의 값이 같은 경우
            answer = (int) Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2);    
        } else if(dice[0] == dice[1] && dice[2] == dice[3]) {
            // 2개 값 같은 경우
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);

        } else if(dice[0] == dice[1]) {
            // 1개의 값만 같은 경우
            answer = dice[2] * dice[3];
        } else if(dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if(dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            // 다 다른 값인 경우
            answer = dice[0];
        }
        
        return answer;
    }
}