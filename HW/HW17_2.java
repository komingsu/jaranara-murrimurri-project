// 실습문제 3-4
// 알파벳을 입력받고 입력받은 알파벳 까지 a~ 작성하는 프로그램을 작성하라

import java.util.*;

public class HW17_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 위치 정보 temp
        int temp = 0;

        // 알파벳을 담아둠
        String stringArray[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // 소문자 알파벳 입력
        System.out.print("알파벳 소문자를 입력해주세요 : ");
        String Alpha = sc.next();




        // 알파벳이 같으면 temp <- i 대입
        // 문자열이 같다는 것을 비교할 때는 equals()로 비교한다
        for (int i = 0; i<stringArray.length; i++) {
            if (stringArray[i].equals(Alpha)) {
                temp = i;
            }
        }

        // 찾아낸 temp 위치+1 까지 반복한다
        for (int j = 0; j<temp+1; j++) {
            for (int k = 0; k<temp-j+1; k++) {
                System.out.print(stringArray[k]);
                
            }
            System.out.println();
        }
    }
}