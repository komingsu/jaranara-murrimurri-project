
import java.util.*;

public class HW13 {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        char mod;
        int num1 , num2;
        double tot=0;
        do {
            System.out.println("원하는 계산기 모드를 입력해주세요 (+,-,*,/)");
            mod = sc.next().charAt(0);
        }while( mod !='+' && mod != '-' && mod !='*' && mod !='/');

        do {
            System.out.println("숫자 2개를 입력해주세요");
            System.out.println("첫번째 숫자");
            num1 = sc.nextInt();
            System.out.println("두번째 숫자");
            num2 = sc.nextInt();
        }while(mod=='/' && num2==0);

        switch(mod) {
            case '+' : tot = num1+num2;break;
            case '-' : tot = num1-num2;break;
            case '*' : tot = num1*num2;break;
            case '/' : tot = num1/num2;break;
        }

        System.out.println();
        System.out.println(num1+""+mod+""+num2+"="+tot);
    }
}