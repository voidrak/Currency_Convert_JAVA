package Currency_Converter_Program;

public class euro extends fatherClass{
    void convert() {
        double bef;
        double aft=0;
        int choice_to;
        System.out.println("Enter the Amount In Euro");
        bef= scan.nextInt();
        System.out.println("Choose the Currency You Want  to Change");
        System.out.println("1.South African Rand\t2.USA Dollar");
        System.out.println("3. UK Pound\t\t\t\t4. Ethiopian Birr ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Russian Ruble");
        System.out.println("***************** ");
        choice_to=scan.nextInt();
        switch (choice_to) {
            case 1 -> aft = bef *19.34;
            case 2 -> aft = bef *1.06;
            case 3 -> aft = bef *0.88;
            case 4 -> aft = bef *56.97;
            case 5 -> aft = bef *3.97;
            case 6 -> aft = bef *1383.04;
            case 7 -> aft = bef *79.52;
            default -> System.out.println("Wrong Input");
        }

        System.out.printf("%.2f",aft);
    }
}
