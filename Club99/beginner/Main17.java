package Club99.beginner;

import java.io.*;

public class Main17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder skills = new StringBuilder(br.readLine());

        int count = 0;
        int LRcount = 0, SKcount = 0;

        outerloop: for (int i = 0; i < N; i++) {
            char c = skills.charAt(i);

            if (Character.isDigit(c)) {
                // 숫자 기술은 연계 필요 없으므로 항상 성공
                count++;
            } else {
                switch (c) {
                    case 'L':
                        LRcount++;  // L 발생 시 연계 카운트 증가
                        break;
                    case 'R':
                        if (LRcount > 0) {
                            LRcount--;  // 사전 기술이 있을 경우 본 기술 발동 후 연계 카운트 감소
                            count++;
                        } else
                            break outerloop;  // 본 기술을 사용할 수 없을 때 종료
                        break;
                    case 'S':
                        SKcount++;  // S 발생 시 연계 카운트 증가
                        break;
                    case 'K':
                        if (SKcount > 0) {
                            SKcount--;
                            count++;
                        } else
                            break outerloop;  // 본 기술을 사용할 수 없을 때 종료
                        break;
                    default:
                        break;
                }
            }
        }
        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}