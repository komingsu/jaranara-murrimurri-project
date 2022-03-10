// 예제 3-10
// 2차원 배열, 배열은 { } 중괄호로 묶는다. 배열끼리 묶는것도 { } 이다.


public class HW16_1 {
    public static void main(String[] agrs) {
        double score[][] = {
            {3.3, 3.4},
            {3.5, 3.6},
            {3.7, 4.0},
            {4.2, 4.2} };
        
        double sum=0;
        for(int year=0; year<score.length; year++) {
            for(int term=0; term<score[year].length; term++) {
                sum += score[year][term];
            }
        }

        int n = score.length;
        int m = score[0].length;

        System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
    }
}
