class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
        
            while(s < e) {
                char temp = answer[s];
                answer[s] = answer[e];
                answer[e] = temp;
                s++;
                e--;
            }
        }
        
        return new String(answer);
    }
}