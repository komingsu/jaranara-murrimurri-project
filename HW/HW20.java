// 예제 4-2
// 너비와 높이를 입력받고
// 사각형의 넓이를 계산하는 메소드 getArea() 를 가진 Rectangle 클래스를 만들어라
import java.util.*;

class Rectangle {

    int width;
    int height;
    public int getArea() {
        return width*height;
    }
}

public class HW20 {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("너비[m]를 입력해주세요 : ");
        rect.width = sc.nextInt();
        System.out.print("높이[m]를 입력해주세요 : ");
        rect.height = sc.nextInt();

        System.out.println("사각형의 면적은 "+rect.getArea()+" [m^2] 입니다");
        sc.close();
    }
}
