package software.ulpgc;

public class Main {
    static void main() {
        Book book = new Book("Hola", 2.5, 9);
        System.out.println(book.totalPrice());
    }
}
