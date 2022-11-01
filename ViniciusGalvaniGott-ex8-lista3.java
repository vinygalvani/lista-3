import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
       for (int i = 1; i <= 100; i++) {
            int cont = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++cont;
            }
            if (cont == 2) {
                System.out.println(i);
            }
        }
    }
}