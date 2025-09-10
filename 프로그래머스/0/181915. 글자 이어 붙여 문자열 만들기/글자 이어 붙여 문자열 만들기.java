class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        
        char[] c = my_string.toCharArray();
        
        for(int i : index_list) {
            answer.append(c[i]);
        }
        
        return answer.toString();
    }
}