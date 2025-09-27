class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int idx = 0;
        while ((idx = myString.indexOf(pat, idx)) != -1) {
            count++;
            idx++; // 다음 탐색 시작 위치를 현재 위치 다음으로 이동
        }
        return count;
    }
}