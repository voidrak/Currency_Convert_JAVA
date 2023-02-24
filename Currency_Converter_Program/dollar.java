package Currency_Converter_Program;

public class dollar extends fatherClass {
    @Override
    void convert() {
        double bef;
        double aft=0;
        int choice_to;
        System.out.println("Enter the Amount In USA Dollar");
        bef= scan.nextInt();
        System.out.println("Choose the Currency You Want  to Change");
        System.out.println("1.South African Rand\t2.Ethiopia Birr");
        System.out.println("3. UK Pound\t\t\t\t4. Euro ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Russian Ruble");
        System.out.println("***************** ");
        choice_to=scan.nextInt();
        switch (choice_to) {
            case 1 -> aft = bef * 18.25;
            case 2 -> aft = bef * 53.78;
            case 3 -> aft = bef / 0.83;
            case 4 -> aft = bef / 0.94;
            case 5 -> aft = bef * 3.75;
            case 6 -> aft = bef * 1305.83;
            case 7 -> aft = bef * 75.12;
            default -> System.out.println("Wrong Input");
        }

        System.out.printf("%.2f",aft);
    }
}
