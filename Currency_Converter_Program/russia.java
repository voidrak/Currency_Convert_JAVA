package Currency_Converter_Program;

public class russia extends fatherClass{
    void convert() {
        double bef;
        double aft=0;
        int choice_to;
        System.out.println("Enter the Amount In Russian Ruble");
        bef= scan.nextInt();
        System.out.println("Choose the Currency You Want  to Change");
        System.out.println("1.South African Rand\t2.USA Dollar");
        System.out.println("3. UK Pound\t\t\t\t4. Euro ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Ethiopia Birr");
        System.out.println("***************** ");
        choice_to=scan.nextInt();
        switch (choice_to) {
            case 1 -> aft = bef *0.24;
            case 2 -> aft = bef *0.012;
            case 3 -> aft = bef * 0.011;
            case 4 -> aft = bef *0.013;
            case 5 -> aft = bef *0.050;
            case 6 -> aft = bef *17.40;
            case 7 -> aft = bef *0.72;
        }

        System.out.printf("%.2f",aft);
    }
}
