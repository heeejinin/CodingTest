package Club99.beginner;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());  // 테스트 케이스 개수

        for (int i = 1; i <= N; i++) {
            String line = scanner.nextLine();          // 각 테스트 케이스 입력받기
            String[] words = line.split(" ");          // 단어별로 분리
            Collections.reverse(Arrays.asList(words)); // 단어 순서 뒤집기

            System.out.print("Case #" + i + ": ");
            System.out.println(String.join(" ", words));
        }

        scanner.close();
    }
}
