package week_01.assignment;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds");
        System.out.println("One death every 13 seconds");
        System.out.println("One new immigrant every 45 seconds");
        System.out.println("Yearly Population projection formula:");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaaths per year)");
        System.out.println("                   + (new immigrants per year)");
        System.out.println("Year 1 projection:");
        System.out.println((312032486 + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0));
        System.out.println("Year 2 projection:");
        System.out.println(((312032486 + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0));
        System.out.println("Year 3 projection:");
        System.out.println((((312032486 + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0));
        System.out.println("Year 4 projection:");
        System.out.println(((((312032486 + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0));
        System.out.println("Year 5 projection:");
        System.out.println((((((312032486 + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0) + ((3600 * 24.0) * 365.0) / 7.0 - ((3600 * 24.0) * 365.0) / 13.0 + ((3600 * 24.0) * 365.0) / 45.0));

    }

}
