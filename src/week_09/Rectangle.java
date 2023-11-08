package assignments.week_09;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }


}
