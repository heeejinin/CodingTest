class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String result = "" + a + b;
        
        answer = Integer.parseInt(result) >= answer ? Integer.parseInt(result) : answer; 
        
        return answer;
    }
}