package ACodingTest;


public class Seats {

    public int permutation(int n, int r) {
        int answer = r > 0 ? n : 1;
        for(int i = 1; i < r; i++) answer *= (n - i);
        return answer;
    }

    public int solution(int[] nums) {
        int cnt = 0, neighbor = 0, total = 0;
        for (int num : nums) {
            if (num == 0) {
                cnt++;
                total++;
            } else {
                if(cnt > 0) neighbor += cnt - 1;
                cnt = 0;
            }
        }

        if(cnt > 0) neighbor += (cnt-1);
        return neighbor * 2 * permutation(total-2, 3);
    }


    public static void main(String[] args) {
        Seats T = new Seats();
        System.out.println(T.solution(new int[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 1}));
        System.out.println(T.solution(new int[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 0}));
        System.out.println(T.solution(new int[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}));
        System.out.println(T.solution(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0}));
        System.out.println(T.solution(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
