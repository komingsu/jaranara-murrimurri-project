public class MethodPrac2 {
  
    
// 지역변수를 헷갈리면 안된다. main의 int z 와 add()의 int z는 다르다.
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int z = add(x,y);

        System.out.println(z);
    }

    static int add(int x, int y) {

        int z = x+y;
        return z;

    }



}
