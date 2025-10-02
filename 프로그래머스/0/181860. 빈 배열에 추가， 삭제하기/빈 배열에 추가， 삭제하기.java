import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                int removeIdx = arr[i];
                int idx = list.size();
                if(idx >= removeIdx) {
                    list = new ArrayList<>(list.subList(0, idx - removeIdx));
                } else {
                    list.clear();
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}