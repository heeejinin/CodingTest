package Club99.beginner;

import java.io.*;
import java.util.*;

public class MatchingSongs7 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄 입력 처리
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);  // 아는 노래의 개수
        int m = Integer.parseInt(firstLine[1]);  // 맞히기를 시도할 노래의 개수

        Map<String, List<String>> songMap = new HashMap<>();  // 첫 세 음 패턴과 노래 제목 매핑

        // n개의 노래 정보 입력
        for (int i = 0; i < n; i++) {
            String[] songInfo = br.readLine().split(" ");
            String title = songInfo[1];  // 노래 제목
            String pattern = songInfo[2] + songInfo[3] + songInfo[4];  // 첫 세 음 패턴

            // Map에 패턴을 키로, 해당 패턴의 노래 제목 리스트로 저장
            songMap.computeIfAbsent(pattern, k -> new ArrayList<>()).add(title);
        }

        // m개의 맞히기 시도 처리
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            String inputSongs = input[0] + input[1] + input[2];  // 시도하는 첫 세 음 패턴

            List<String> matchingSongs = songMap.get(inputSongs);  // 패턴에 일치하는 노래 제목 리스트 가져오기

            if (matchingSongs == null) {
                bw.write("!\n");  // 패턴에 맞는 노래가 없을 경우
            } else if (matchingSongs.size() == 1) {
                bw.write(matchingSongs.get(0) + "\n");  // 패턴에 맞는 노래가 하나일 경우 해당 제목 출력
            } else {
                bw.write("?\n");  // 패턴에 맞는 노래가 여러 개일 경우 ? 출력
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
