package Currency_Converter_Program;

public class southAfrica extends fatherClass {
    @Override
    void convert() {
        double bef;
        double aft=0;
        int choice_to;
        System.out.println("Enter the Amount In South African Rand");
        bef= scan.nextInt();
        System.out.println("Choose the Currency You Want  to Change");
        System.out.println("1.Ethiopian Birr\t\t2.USA Dollar");
        System.out.println("3. UK Pound\t\t\t\t4. Euro ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Russian Ruble");
        System.out.println("***************** ");
        choice_to=scan.nextInt();
        switch (choice_to) {
            case 1 -> aft = bef*2.95;
            case 2 -> aft = bef /18.24;
            case 3 -> aft = bef / 21.92;
            case 4 -> aft = bef / 19.33;
            case 5 -> aft = bef / 4.8;
            case 6 -> aft = bef / 0.0014;
            case 7 -> aft = bef / 0.24;
            default -> System.out.println("Wrong Input");
        }

        System.out.printf("%.2f",aft);
    }
}
