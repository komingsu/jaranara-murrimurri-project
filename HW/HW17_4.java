// 실전문제 3-7
// 랜덤으로 100개의 (1~10)사이 정수를 뽑아 배열을 만들어라
// 그 배열의 숫자들을 10개씩 묶어 출력하고 평균을 출력하라.
import java.util.*;

public class HW17_4 {
    
    public static void main(String[] args) {

        int intArray[] = new int[100];
        Random random = new Random();
        int sum = 0;

        for (int i=0; i<100; i++) {
            intArray[i] = random.nextInt(9)+1;
            sum += intArray[i];
        }

        for (int j=0; j<10; j++) {
            for (int k=0; k<10; k++) {
                System.out.print(intArray[j*10+k]+" ");
            }
            System.out.println();
        }
        System.out.println((double)sum/intArray.length);
    }
}
