package assignments.week_10;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("Nisanur", 23, 62, 5, 2);

        System.out.println("Name   : " + bmi.getName());
        System.out.println("Age    : " + bmi.getName());
        System.out.println("Weight : " + bmi.getWeight());
        System.out.println("Height : " + bmi.getHeight());

        double calculateBMI = bmi.getBMI();
        System.out.println("BMI    : " + calculateBMI + " " + bmi.getStatus());


    }
}
