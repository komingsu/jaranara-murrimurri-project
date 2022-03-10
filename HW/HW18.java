// 구구단 만들기
// 가장 윗줄에는 단수를 적는다
// 각각의 구구단에는 탭으로 거리를 둔다

public class HW18 {

    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            
            for (int j=1; j<10; j++) {

                if(i==0) {
                    System.out.print(j+"단");
                    System.out.print("\t");
                }
                else {
                    System.out.print(j+"*"+i+"="+i*j);
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
