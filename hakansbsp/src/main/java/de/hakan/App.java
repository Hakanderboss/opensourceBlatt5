package de.hakan;
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        System.out.println("Eingabe: ");
        String eingabe;
        Scanner scanner = new Scanner(System.in);
        eingabe = scanner.nextLine();

        for (
                char c : eingabe.toCharArray())

        {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
    }
}

