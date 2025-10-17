import java.util.*;

class Solution {
   	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int idx[] = new int[rank.length];
        
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				idx[i] = rank[i];
			} else {
				rank[i] = Integer.MAX_VALUE;
			}
		}
        
		Arrays.sort(rank);

		for (int i = 0; i < idx.length; i++) {
			if (rank[0] == idx[i]) {
				answer += i * 10000;
			} else if (rank[1] == idx[i]) {
				answer += i*100;
			} else if (rank[2] == idx[i]) {
				answer += i;
			}
		}

		return answer;
	}
}