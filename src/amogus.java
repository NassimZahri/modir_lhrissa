import java.awt.*;
import java.util.Scanner;

public class amogus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Les multiples de 3: ");
        for (int i = 0; i <= 100; i++) {
            if ( i % 3 == 0){
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.print("Les multiples de 5: ");
        for (int i = 0; i <= 100; i++) {
            if ( i % 3 == 0){
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.print("Les multiples de 5 et 3: ");
        for (int i = 0; i <= 100; i++) {
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.print(i);
            }
        }

    }
}
