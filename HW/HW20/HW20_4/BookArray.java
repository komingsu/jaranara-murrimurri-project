package HW20.HW20_4;
// 예제 4-7
// 클래스를 활용하여 객체 배열 만들기
import java.util.*;

class Book {
    String title, author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book [] book = new Book[2];
        

        for(int i=0; i<book.length; i++) {

            System.out.print((i+1)+"번째 책의 제목 : ");
            String title = sc.nextLine();
            System.out.print((i+1)+"번째 책의 저자 : ");
            String author = sc.nextLine();

            book[i] = new Book(title, author);
        }

        for(int i=0; i<book.length; i++) {
            System.out.println((i+1)+"번째 책 ("+book[i].title+" "+book[i].author+")");
        }

        sc.close();
    }
}
