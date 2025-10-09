import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> s = new ArrayList<>();
        for (int i : arr) {
            if (s.isEmpty() || !s.contains(i) && s.size() < k)
                s.add(i);
        }
        for (int i = s.size(); i < k; i= s.size()) {
            s.add(-1);
        }
        return s.stream().mapToInt(i->i).toArray();
    }
}