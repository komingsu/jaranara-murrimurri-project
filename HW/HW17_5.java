// 실습문제 3-9

import java.util.*;

public class HW17_5 {
    
    public static void main(String[] agrs) {

        Random random = new Random();
        int intArray[][] = new int[4][4];

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                intArray[i][j] = random.nextInt(9)+1;
            }
        }

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
