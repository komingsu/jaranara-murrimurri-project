
import java.util.*;

public class HW12_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개 입력 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num;
        System.out.println();

        if (num1>num2 && num1>num3) {
            if (num3>num2) {
                num = num3;
            }
            else {
                num = num2;
            }
        }
        else if (num2>num1 && num2>num3) {
            if (num1>num3){
                num = num1;
            }
            else {
                num = num3;
            }
        }
        else {
            if (num1>num2) {
                num = num1;
            }
            else {
                num = num2;
            }
        }
        System.out.println(num);
    }
}

        