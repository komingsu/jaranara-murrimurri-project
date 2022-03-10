// 실전문제 3-7
// 랜덤으로 n^2 개의 (1~10)사이 정수를 뽑아 배열을 만들어라
// 그 배열의 숫자들을 n개씩 묶어 출력하고 평균을 출력하라.

import java.util.*;

public class HW17_4_2 {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.print("정수를 입력해주세요 : ");
        int n = sc.nextInt();
        int sum = 0;
        int intArray[] = new int[n*n];

        for (int i=0; i<intArray.length; i++) {
            intArray[i] = random.nextInt(9)+1;
            sum += intArray[i];
        }

        for (int j=0; j<n; j++) {
            for (int k=0; k<n; k++) {
                System.out.print(intArray[j*n+k]+" ");
            }
            System.out.println();
        }
        System.out.println("평균 : "+(double)sum/intArray.length);
        sc.close();
    }
}
