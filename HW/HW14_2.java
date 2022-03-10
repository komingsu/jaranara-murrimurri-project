// 평균을 구하는 프로그램

import java.util.*;

public class HW14_2 {
    public static void main(String[] args) {

        // intArray 라는 정수 배열을 만든다. 배열의 크기는 5
        int intArray[] = new int[5];
        // 합 sum 을 선언해 둔다.
        int sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.print(intArray.length + "개의 정수를 입력하세요>> ");

        //intArray[i]에서 i: 0~4까지 스캐너를 통해 정수를 받는다
        for(int i =0 ; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        //sum에 받아둔 intArray의 값들을 더해준다.
        for(int i = 0; i<intArray.length; i++) {
            sum += intArray[i];

        }
        System.out.print("평균은 " + (double)sum/intArray.length);
        sc.close();
    }
}