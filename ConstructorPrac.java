
public class ConstructorPrac {
    
    public static void main(String[] args) {

        Human human1 = new Human("Minsu",28,73.3);
        Human human2 = new Human("juyeon",20,35.5);

        System.out.println(human1.name);
        System.out.println(human2.name);

        System.out.println(human2.weight);
        human2.eat();
        System.out.println(human2.weight);

    }
}

class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name+" is eating");
        this.weight = this.weight + 0.5;
    }

    void drink() {
        System.out.println(this.name+" is drinking");
    }
}
