// 0으로 나눌 때 발생하는 ArithmeticException 예외 처리하기

import java.util.*;

public class HW16_2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("나뉘는 수를 입력하세요 : ");
            int dividend = sc.nextInt();
            System.out.print("나누는 수를 입력하세요 : ");
            int divisor = sc.nextInt();

            try {
                System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor +"입니다.");
                break;
            }
            catch (ArithmeticException e) {
                System.out.println("0 으로는 나눌수 없습니다! 다시 입력하세요");
            }
        }
        sc.close();
    }
}