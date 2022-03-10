import java.util.ArrayList;

public class ArrayListPrac {
    
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2); // 2번 없앰
        food.clear(); //모두 없앰

        for(int i=0; i<food.size();i++) {
            System.out.println(food.get(i));
        }
        


    }
}
