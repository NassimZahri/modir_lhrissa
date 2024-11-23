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

        /*System.out.println("Bienvenue dans le jeu de devinette");
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
        }*/

        /*int[] tableauZwin = new int[10];

        for (int i = 0; i < 10 ; i++){
            tableauZwin[i] =(int) (Math.random() * 100);
        }

        System.out.println("Tableau : ");
        for (int i = 0; i < tableauZwin.length; i++) {
            System.out.print(tableauZwin[i]);
            System.out.print(" | ");
        }

        System.out.println();
        System.out.println("Tableau inverse : ");
        for (int i = tableauZwin.length -1; i >= 0 ; i--) {
            System.out.print(tableauZwin[i]);
            System.out.print(" | ");
        }
        System.out.println();*/

       /* int[] tableauZwin = new int[10];

        for (int i = 0; i < 10 ; i++){
            if ((i & 2) == 0) {
                tableauZwin[i] = 9;
            }else
                tableauZwin[i] =(int) (Math.random() * 100);
        }

        System.out.println("Tableau : ");
        for (int i = 0; i < tableauZwin.length; i++) {
            System.out.print(tableauZwin[i]);
            System.out.print(" | ");
        }


        System.out.println();
        System.out.print("Look for the value => ");
        int target = scan.nextInt();

        int count = 0;
        for (int i = 0; i < tableauZwin.length; i++) {
            if (target == tableauZwin[i]){
                count++;
            }
        }

        System.out.print(target + " was found " + count + " time(s).");*/

            int[] tab1 = new int[5];
            int[] tab2 = new int[5];
            int[] tab = new int[10];
            Scanner s = new Scanner(System.in);

            System.out.println("Veuillez saisir 5 nombres :");
            for (int i = 0; i < tab1.length; i++) {
                tab1[i] = s.nextInt();
            }

            System.out.println("Veuillez saisir 5 autres nombres :");
            for (int i = 0; i < tab2.length; i++) {
                tab2[i] = s.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                tab[i] = tab1[i];
            }
            for (int i = 5; i < 10; i++) {
                tab[i] = tab2[i - 5];
            }

            System.out.println("Tableau fusionné :");
            for (int i = 0; i < 10; i++) {
                System.out.println("tab[" + i + "] = " + tab[i]);
            }

            for (int i = 0; i < tab.length - 1; i++) {
                for (int j = 0; j < tab.length - 1 - i; j++) {
                    if (tab[j] > tab[j + 1]) {
                        int temp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = temp;
                    }
                }
            }

            System.out.println("Tableau trié :");
            for (int i = 0; i < 10; i++) {
                System.out.println("tab[" + i + "] = " + tab[i]);
            }

    }
}
