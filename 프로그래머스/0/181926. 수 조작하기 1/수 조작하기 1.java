class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(char c : control.toCharArray()){
            switch(c){
                    case 'w' -> answer += 1;
                    case 's' -> answer -= 1;
                    case 'd' -> answer +=10;
                    case 'a' -> answer -=10;
            }
        }
        
        return answer;
    }
}