class Solution {
    public String solution(String myString, String pat) {
        int lastPat = myString.lastIndexOf(pat); 

        if (lastPat != -1) {
            return myString.substring(0, lastPat + pat.length());
        } 
        return "";
    }
}