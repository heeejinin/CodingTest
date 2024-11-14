package Club99.beginner;

import java.io.*;
import java.util.*;

public class Main6 {

    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 빠르게 하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());  // 입력받은 카드 개수 N
        Map<String, Integer> fruitsMap = new HashMap<>();  // 각 과일별 개수를 저장할 Map 생성

        // 입력받은 카드 정보를 통해 과일 개수를 누적
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");  // 과일 종류와 개수 입력
            String fruit = input[0];  // 과일 종류
            int count = Integer.parseInt(input[1]);  // 해당 과일의 개수

            // 과일 개수를 누적하여 Map에 저장
            fruitsMap.put(fruit, fruitsMap.getOrDefault(fruit, 0) + count);
        }

        // 정확히 5개인 과일이 존재하는지 검사
        boolean bell = fruitsMap.values().stream().anyMatch(cnt -> cnt == 5);

        // 검사 결과에 따라 YES 또는 NO를 출력
        bw.write(bell ? "YES" : "NO");
        bw.flush();  // 출력 버퍼를 비워 출력 수행

        br.close();
        bw.close();  // 자원 해제
    }
}
