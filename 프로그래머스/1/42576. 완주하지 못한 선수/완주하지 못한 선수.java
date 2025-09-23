import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. 참가자와 완주자 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 2. 정렬된 배열을 순차적으로 비교하여 다른 이름을 찾기
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        // 3. 만약 모두 일치하면 마지막 참가자가 완주하지 못한 사람임
        return participant[participant.length - 1];
    }
}
