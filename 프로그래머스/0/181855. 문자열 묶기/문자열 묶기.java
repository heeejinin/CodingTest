import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        int maxCount = 0;

        for (String s : strArr) {
            int length = s.length();
            int currentCount = lengthCount.getOrDefault(length, 0) + 1;
            lengthCount.put(length, currentCount);
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}