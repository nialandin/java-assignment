package assignments.week_10;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Bounding Rectangle: \n" +
                "Center: (" + x + ", " + y + ")\n" +
                "Width: " + width + "\n" +
                "Height: " + height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        if ((this.getX() - (width / 2) < x && x < this.getX() + (width / 2)) &&
                (this.getY() - (height / 2) < y && y < this.getY() + (height / 2))) {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D r) {
        if (contains(r.getX() + r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() + r.getWidth() / 2, r.getY() - r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() - r.getHeight() / 2)) {
            return true;
        }
        return false;
    }

}

