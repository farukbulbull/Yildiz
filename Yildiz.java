import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = inp.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}