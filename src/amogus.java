import java.util.Scanner;

public class amogus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*while (true) {
            char operation = ' ';

            while (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != 'q') {
                System.out.print("Choose an operation ( + , - , * , /, q to quit ) => ");
                operation = scan.next().charAt(0);
            }

            if (operation == 'q') {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.print("Enter 1st operand => ");
            double op1 = scan.nextDouble();
            System.out.print("Enter 2nd operand => ");
            double op2 = scan.nextDouble();


            switch (operation) {
                case '+':
                    System.out.println("Sum = " + (op1 + op2));
                    break;
                case '-':
                    System.out.println("Subtraction = " + (op1 - op2));
                    break;
                case '*':
                    System.out.println("Multiplication = " + (op1 * op2));
                    break;
                case '/':
                    if (op2 == 0) {
                        System.out.println("Division impossible!");
                    } else {
                        System.out.println("Division = " + (op1 / op2));
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        }

        scan.close();
    */

        System.out.println("Bienvenue dans le jeu de devinette");
        int r = (int) (Math.random() * 100) + 1;
        int x =0;
        boolean y = true;
        while(y){
            System.out.println("devinez le nbr secret : ");
            int n = scan.nextInt();
            if(n > r){
                System.out.println("Tros haut , redevinez lz nbr secret ! ");
                x++;
            }
            else if(n<r){
                System.out.println("Tros bas , redevinez lz nbr secret ! ");
                x++;
            }
            else{
                System.out.println("Tres bien !! , vous avez devinez le nbr secret ! ");
                y=false;
            }
        }
    }
}
