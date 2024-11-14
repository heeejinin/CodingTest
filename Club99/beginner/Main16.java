package Club99.beginner;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드의 개수 입력받기
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 1부터 N까지의 숫자를 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder result = new StringBuilder();

        // 큐가 한 장 남을 때까지 반복
        while (queue.size() > 1) {
            // 첫 번째 카드를 버리고 결과에 추가
            result.append(queue.poll()).append(" ");
            // 다음 카드를 맨 뒤로 이동
            queue.add(queue.poll());
        }

        // 마지막 남은 카드 출력
        result.append(queue.poll());
        System.out.println(result.toString());
    }
}