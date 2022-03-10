// 실습문제 3-5
// 정수 10개를 입력받고 3의 배수만 출력하는 프로그램을 작성하라
import java.util.*;

public class HW17_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] intArray = new int[10];
        System.out.println("양의정수 10개를 입력해주세요 : ");

        for (int i=0; i<10; i++) {
            System.out.print((i+1)+"번째 정수 : ");
            intArray[i] = sc.nextInt();
        }
        
        //정렬
        Arrays.sort(intArray);

        System.out.print("3의 배수는 ");
        for (int j=0; j<10; j++) {
            if (intArray[j]%3==0) {
                System.out.print(intArray[j]+" ");
            }
        }
        System.out.print("입니다.");
    }
}
