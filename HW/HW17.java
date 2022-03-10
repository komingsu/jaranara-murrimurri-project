// 실습예제 3-3
// 입력받아서 *를 찍는 프로그램
// 탑으로 찍는 걸로 바꿈

import java.util.*;

public class HW17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.print("탑의 높이를 입력해주세요 : ");
        int high = sc.nextInt();

        size = high*2-1;


        for (int i = 0; i<high; i++) {
            
            for (int j = 0; j<high-i; j++ ) {
                System.out.print(" ");
            }
            for (int k = 0; k<2*i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
