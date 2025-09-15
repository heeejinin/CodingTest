class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // s~e 구간만 뒤집기
        String reversed = new StringBuilder(my_string.substring(s, e + 1))
                              .reverse()
                              .toString();
        
        // s~e 구간을 뒤집힌 문자열로 교체
        sb.replace(s, e + 1, reversed);
        
        return sb.toString();
    }
}