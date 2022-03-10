// 예제 4-3
// 2개의 생성자를 가진 Circle -> HW20_2 에서 실행경과를 확인하라

public class HW20_2 {
    int radius;
    String name;

    public HW20_2() {
        radius = 1;
        name = "";
    }
    
    public HW20_2(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.141592*radius*radius;
    }

    public static void main(String[] args) {
        
        HW20_2 pizza = new HW20_2(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+ area);

        HW20_2 donut = new HW20_2();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+ area);
        
    }
}

// 같은 이름의 클래스에서는 생성자의 기입에 따라 다른 클래스로 입력되는것을 확인할 수 있다.