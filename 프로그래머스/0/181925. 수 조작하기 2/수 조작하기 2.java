class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = numLog[0];
        
        for(int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - num;    
            
            switch(diff){
                    case 1 -> answer += "w";
                    case -1 -> answer += "s";
                    case 10 -> answer += "d";
                    case -10 -> answer += "a";
            }
            num = numLog[i];
        }
        
        
        return answer;
    }
}