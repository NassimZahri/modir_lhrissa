import java.awt.*;
import java.time.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
                String myString = "Lorem ipsum odor amet, consectetuer adipiscing elit. Ligula aliquam feugiat nibh litora convallis. Mattis non curae euismod massa dignissim et eget adipiscing. Sapien in eget etiam sollicitudin tristique nisi erat auctor augue? Maximus massa purus dolor tellus, dictum odio taciti curae. Hac pellentesque amet potenti magna accumsan, odio malesuada ullamcorper. Consequat parturient elementum molestie natoque pellentesque vitae. Suscipit nunc porta ultrices ligula semper tincidunt. Conubia commodo accumsan fames nullam vulputate morbi quisque.";

        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());

        System.out.println(" ");
        System.out.println(myString.substring(3,8).replace(" ", "[SPACE_BAR]") );

        System.out.println(" ");
        System.out.print("Starts with \"Lorem\": ");
        System.out.println(myString.startsWith("Lorem"));
        System.out.print("Ends with \".\": ");
        System.out.println(myString.endsWith("."));

        System.out.println(" ");
        System.out.println(myString.length());
        System.out.println(myString.indexOf("m"));
*/

        /*        StringBuilder reversed = new StringBuilder();

        /////////////////////

        LocalDate lyouma = LocalDate.now();
        LocalTime daba = LocalTime.now();
        LocalDateTime lyouma_daba = LocalDateTime.now();

        LocalDate chi_nhar = LocalDate.of(2001, Month.SEPTEMBER, 11);
        LocalTime chi_w9ita = LocalTime.of(7,15);
        LocalDateTime chi_w9ita_nhar = LocalDateTime.of(2002,Month.JULY,11,22,50);

        LocalDateTime wahd_w9ita_nhar = chi_nhar.atTime(chi_w9ita);
        LocalDate nhar_flani = wahd_w9ita_nhar.toLocalDate();

        System.out.println(lyouma);
        System.out.println(daba);
        System.out.println(lyouma_daba);
        System.out.println();
        System.out.println(chi_nhar);
        System.out.println(chi_w9ita);
        System.out.println(chi_w9ita_nhar);
        System.out.println();
        System.out.println(wahd_w9ita_nhar);
        System.out.println(nhar_flani);

        System.out.println();
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime different = current.withMinute(14).withDayOfMonth(11).plusHours(4);
        int year = current.getYear();

        System.out.println(current);
        System.out.println(different);
        System.out.println(year);
        System.out.println(current.isBefore(different));

        LocalDate lyouma = LocalDate.now();
        LocalDate dancingJews = LocalDate.of(2001,Month.SEPTEMBER,11);
        Instant horodatage = Instant.now();
        int chabNano = horodatage.getNano();
        Period howMuchTime = Period.between(dancingJews,lyouma);
        Duration twoHours = Duration.ofHours(2);
        long secondes = twoHours.minusMinutes(15).getSeconds();
        int days = howMuchTime.getDays();

        System.out.println(lyouma);
        System.out.println(dancingJews);
        System.out.println(horodatage);
        System.out.println(chabNano);
        System.out.println(howMuchTime);
        System.out.println(twoHours);
        System.out.println(secondes);
        System.out.println(days);*/

        /*LocalDate lyouma = LocalDate.now();
        LocalDate chiNhar = LocalDate.of(2024,Month.SEPTEMBER,11);
        LocalDate be3d_be3d_be3d_be3d_ghda = lyouma.plusDays(5);

        System.out.print("Lyoum: ");
        System.out.println(lyouma);

        System.out.print("Chi nhar: ");
        System.out.println(chiNhar);

        System.out.print("be3d be3d be3d be3d ghda: ");
        System.out.println(be3d_be3d_be3d_be3d_ghda);

        System.out.print(lyouma.getDayOfMonth());
        System.out.print(" ");
        System.out.print(lyouma.getMonth());
        System.out.print(", ");
        System.out.print(lyouma.getYear());

        System.out.println("____________________________________________");*/

        /*LocalTime daba = LocalTime.now();
        LocalTime chiW9ita = LocalTime.of(15,30,0);
        LocalTime mnDabaLchiChiChwia = daba.plusMinutes(45);

        System.out.print("daba: ");
        System.out.println(daba);

        System.out.print("Chi w9ita: ");
        System.out.println(chiW9ita);

        System.out.print("Mn daba lchi chwia: ");
        System.out.println(mnDabaLchiChiChwia);

        System.out.print(daba.getHour());
        System.out.print(" : ");
        System.out.print(daba.getMinute());
        System.out.print(" : ");
        System.out.println(daba.getSecond());

        System.out.println("____________________________________________");*/

        /*LocalDateTime lyoumaM3a = LocalDateTime.now();
        LocalDateTime chiNharM3a = LocalDateTime.of(2024,Month.DECEMBER,21,22,00);
        LocalDateTime Be3d_Be3d_Ghda_M3a = lyoumaM3a.plusDays(3).plusHours(2);

        System.out.print("Lyouma: ");
        System.out.println(lyoumaM3a);

        System.out.print("Do you remember : ");
        System.out.println(chiNharM3a);

        System.out.print("Be3d be3d ghda o mora 2 d sway3: ");
        System.out.println(Be3d_Be3d_Ghda_M3a);*/

        Scanner scan = new Scanner(System.in);

        /*System.out.print("Write a word: ");
        String jaouda = scan.next();
        System.out.println("=> " + jaouda);

        scan.nextLine();

        System.out.print("Write a sentence: ");
        String raibi = scan.nextLine();
        System.out.println("=> " + raibi);

        System.out.print("Write an integer: ");
        int crevette = scan.nextInt();
        System.out.println("=> " + crevette);

        System.out.print("Write a long: ");
        long samaka = scan.nextLong();
        System.out.println("=> " + samaka);

        System.out.print("Write a float: ");
        float tfa7a = scan.nextFloat();
        System.out.println("=> " + tfa7a);

        System.out.print("Write a double: ");
        double dla7a = scan.nextDouble();
        System.out.println("=> " + dla7a);*/

        /*System.out.println("--------CALCULATRICE--------");
        System.out.println("Entrer le 1er operand: ");
        double operand_1 = scan.nextDouble();
        System.out.println("Entrer le 2eme operand: ");
        double operand_2 = scan.nextDouble();

        System.out.println("Somme = " + (operand_1 + operand_2));
        System.out.println("Soustraction = " + (operand_1 - operand_2));
        System.out.println("Multiplication = " + (operand_1 * operand_2));
        if (operand_2 == 0) {
            System.out.println("Division impossible!");
        } else {
            System.out.println("Division = " + (operand_1 / operand_2));
            System.out.println("Le reste de la division est: " + (operand_1 % operand_2));
        }*/

        /*System.out.println("--------COMPARISATOR--------");
        System.out.println("Entrer le 1er operand: ");
        double operand_1 = scan.nextDouble();
        System.out.println("Entrer le 2eme operand: ");
        double operand_2 = scan.nextDouble();

        System.out.println();

        String estEgal = (operand_1 == operand_2) ? operand_1 + " est egal a " + operand_2 : operand_1 + " est different de " + operand_2 ;
        System.out.println(estEgal);

        String estSupInf = (operand_1 > operand_2) ? operand_1 + " est superieur a " + operand_2 : operand_1 + " est inferieure a " + operand_2 ;
        System.out.println(estSupInf);

        String estSupInfEgal = (operand_1 >= operand_2) ? operand_1 + " est superieur ou egal a " + operand_2 : operand_1 + " est inferieure ou egal a " + operand_2 ;
        System.out.println(estSupInfEgal);*/

        System.out.println("--------MEGATRON--------");
        boolean operand_1, operand_2;
        System.out.println("Do you like the color blue? (Y/n)=>  ");
        while (true) {
            String input = scan.next();
            char isYorN = input.charAt(0);

            if (isYorN == 'Y' || isYorN == 'y') {
                operand_1 = true;
                break;
            } else if (isYorN == 'N' || isYorN == 'n') {
                operand_1 = false;
                break;
            } else {
                System.out.print("Invalid input. Please enter Y or n => ");
            }
        }
        System.out.println("Do you like cars? (Y/n)=>  ");
        while (true) {
            String input = scan.next();
            char isYorN = input.charAt(0);

            if (isYorN == 'Y' || isYorN == 'y') {
                operand_2 = true;
                break;
            } else if (isYorN == 'N' || isYorN == 'n') {
                operand_2 = false;
                break;
            } else {
                System.out.print("Invalid input. Please enter Y or n => ");
            }
        }

        System.out.println();

        String likeBlue = (operand_1 == true) ? "You like blue color.": "You don't like blue color.";
        System.out.println(likeBlue);

        String likeCars = (operand_2 == true) ? "You like cars.": "You don't like cars.";
        System.out.println(likeCars);

        String likeBlueCars = ((operand_1 == true) && (operand_2 == true)) ? "You like blue cars.": "You don't like blue cars.";
        System.out.println(likeBlueCars);

        String likentCars = !(operand_2) ? "You don't like cars." : "You like cars.";
        System.out.println(likentCars);

    }
}