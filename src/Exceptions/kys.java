package Exceptions;

import java.util.Scanner;

public class kys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*    try {
        System.out.println("== Division== ");
        System.out.print("Premier operand => ");
        int operand1 = scan.nextInt();

        System.out.print("Deuxieme operand => ");
        int operand2 = scan.nextInt();

        int result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = " + result);
        }catch (ArithmeticException exep){
            System.out.println("Division par zero impossible.");
        }catch (Exception exep){
            System.out.println("Erreur: " + exep.getMessage());
        }finally {
            System.out.println("fin.");
        }
    }*/
        /*try {
        System.out.print("Premier operand => ");
        int operand1 = Integer.parseInt(scan.nextLine());

        System.out.print("Deuxieme operand => ");
        int operand2 = Integer.parseInt(scan.nextLine());

        int result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = " + result);
    }catch (ArithmeticException exep){
        System.out.println("Division par zero impossible.");
    }
    catch( NumberFormatException exep){
        System.out.println("Invalid input.");
    }
    catch (Exception exep){
            System.out.println("Erreur: " + exep.getMessage());
        }finally {
            System.out.println("fin.");
        }
    }*/

        /*int FiveInts[] = new int[5];
        try {
            System.out.print("");
        }*/

        try {
            System.out.print("Age? => ");
            int age = scan.nextInt();

            if (age < 18) {
                // Lever l'exception si l'âge est inférieur à 18
                throw new InvalidAgeException("Âge invalide : Vous devez avoir au moins 18 ans !");
            }

            System.out.println("Bienvenue !");

        }catch(InvalidAgeException e){
            System.out.println("[erreur] " + e.getMessage());
        }
        catch (NumberFormatException exep) {
            System.out.println("Invalid input.");
        } catch (Exception exep) {
            System.out.println("Erreur: " + exep.getMessage());
        } finally {
            System.out.println("fin.");
        }
    }

}
