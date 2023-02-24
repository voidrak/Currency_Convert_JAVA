package Currency_Converter_Program;

import java.util.Scanner;

public class main_Currency {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double bef=0;
        double aft=0;
        int choice;
        fatherClass fatherClass;
        System.out.println();
        System.out.println("\tWelcome To  Rak Currency Convertor");
        System.out.println("Choose the currency to Convert From");
        System.out.println("1. Ethiopian Birr\t\t2. USA Dollar");
        System.out.println("3. UK Pound\t\t\t\t4. Euro ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Russian Ruble\t\t8. South African Rand");
        choice= scan.nextInt();
        switch (choice) {
            case 1 -> {
                fatherClass = new ethiopia();
                fatherClass.convert();
            }
            case 2 -> {
                fatherClass = new dollar();
                fatherClass.convert();
            }
            case 3 -> {
                fatherClass = new pound();
                fatherClass.convert();
            }
            case 4 -> {
                fatherClass = new euro();
                fatherClass.convert();
            }
            case 5 -> {
                fatherClass = new saudi();
                fatherClass.convert();
            }
            case 6 -> {
                fatherClass = new korea();
                fatherClass.convert();
            }
            case 7 -> {
                fatherClass = new russia();
                fatherClass.convert();
            }
            case 8 -> {
                fatherClass = new southAfrica();
                fatherClass.convert();
            }
            default -> {
                System.out.println("Wrong Input Please Try Again!!!");
            }
        }

    }
}
