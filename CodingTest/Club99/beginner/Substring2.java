package Club99.beginner;

public class Substring2 {

    public int solution(String t, String p) {
        int answer = 0;

        int pLen = p.length();
        long pNum = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLen; i++) {
            String num = t.substring(i, i + pLen);
            long numValue = Long.parseLong(num);

            if (numValue <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
