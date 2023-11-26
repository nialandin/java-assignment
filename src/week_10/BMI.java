package assignments.week_10;

import java.util.zip.CheckedInputStream;

public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;

    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches;
    }

    public double getBMI() {
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underwight";

        } else if (bmi < 25) {
            return "Normal";

        } else if (bmi < 30) {
            return "Overwight";

        } else {
            return "Obese";
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
