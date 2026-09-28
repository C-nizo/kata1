package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cuaderno", 4.5, 3);
        System.out.println(product.calculateTotalPrice());
    }
}
