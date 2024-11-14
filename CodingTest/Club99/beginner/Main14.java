package Club99.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int lastElement = -1;  // 큐의 마지막 요소를 기록하기 위해 사용

        int N = Integer.parseInt(br.readLine());  // 명령어의 수

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.offer(value);
                lastElement = value;  // 마지막 요소를 업데이트
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(lastElement).append("\n");
                }
            }
        }

        System.out.print(sb.toString());
    }
}