// 19번 임의의 세 과목(KOR, ENG, MATH)의 점수 3개를 입력받아 총점과 평균을 구하는 프로그램을 작성

import java.io.*;

public class HW19 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sub = {"국어", "영어", "수학"};
        int score[] = new int[sub.length];
        int sum = 0;

        for(int i=0; i<sub.length; i++) {
            System.out.print(sub[i] + "의 성적을 입력해주세요 : ");
            score[i] = Integer.parseInt(br.readLine());
            sum += score[i];
        }

        System.out.println("3 과목의 총점은 : "+sum+"점 입니다");
        System.out.println("3 과목의 평균은 : "+(float)sum/sub.length+"점 입니다");

    }
}