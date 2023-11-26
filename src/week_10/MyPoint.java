package assignments.week_10;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint (){
        this(0,0);
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(MyPoint anotherPoint) {
        return distance(anotherPoint.getX(), anotherPoint.getY());
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
