package Currency_Converter_Program;

public class pound extends fatherClass{
    void convert() {
        double bef;
        double aft=0;
        int choice_to;
        System.out.println("Enter the Amount In Pound Birr");
        bef= scan.nextInt();
        System.out.println("Choose the Currency You Want  to Change");
        System.out.println("1.South African Rand\t2.USA Dollar");
        System.out.println("3. Ethiopian Birr\t\t4. Euro ");
        System.out.println("5. Saudi Riyal\t\t\t6. South Korean Won ");
        System.out.println("7. Russian Ruble");
        System.out.println("***************** ");
        choice_to=scan.nextInt();
        switch (choice_to) {
            case 1 -> aft = bef *21.94;
            case 2 -> aft = bef *1.20;
            case 3 -> aft = bef * 64.61;
            case 4 -> aft = bef *1.13;
            case 5 -> aft = bef *4.51;
            case 6 -> aft = bef *1568.70;
            case 7 -> aft = bef *90.26;
            default -> System.out.println("Wrong Input");
        }

        System.out.printf("%.2f",aft);
    }
}
