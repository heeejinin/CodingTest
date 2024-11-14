package Club99.beginner;

import java.io.*;
import java.util.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());  // 단어 개수 읽기
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < count; i++) { // 모든 단어 읽기
            list.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb = new StringBuilder(list.get(i)); // 현재 단어 가져오기
            String reverseString = sb.reverse().toString(); // 단어 뒤집기
            if (list.contains(reverseString)) { // 뒤집힌 단어가 리스트에 있는지 확인
                int mid = reverseString.length() / 2; // 가운데 글자 인덱스 계산
                System.out.println(reverseString.length() + " " + reverseString.charAt(mid)); // 길이와 가운데 글자 출력
                break;
            }
        }
    }
}
