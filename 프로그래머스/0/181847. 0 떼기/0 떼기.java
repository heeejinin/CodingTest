class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean flag = false;
        
        for(char c : n_str.toCharArray()) {
            if(c != '0') {
                flag = true;
            }
            
            if(flag) {
                answer += c;
            }
        }
        return answer;
    }
}