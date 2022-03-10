import java.util.*;
public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수를 입력해주세요 : ");
        int number = sc.nextInt();
        if (number %3 == 0) {
            System.out.println("3의 배수입니다.");

        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }
        sc.close();
    }
}
