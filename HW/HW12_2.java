
import java.util.*;
import java.math.*;

public class HW12_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 원의 중심과 반지름 입력 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.println("두번째 원의 중심과 반지름 입력 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double dis_x = (x2-x1)^(x2-x1);
        double dis_y = (y2-y1)^(y2-y1);
        double dis = Math.sqrt((dis_x*dis_x)+(dis_y*dis_y));

        double radio = r2+r1;

        if (dis>radio) {
            System.out.println("원은 겹치지 않는다");
        }

        else {
            System.out.println("두 원은 서로 겹친다");
        }
    }
}