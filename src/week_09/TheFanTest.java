package assignments.week_09;

public class TheFanTest {
    public static void main(String[] args) {

        TheFan fan1 = new TheFan();
        fan1.setSpeed(TheFan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        TheFan fan2 = new TheFan();
        fan2.setSpeed(TheFan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);


        System.out.println( fan1.toString());
        System.out.println("-------------------");
        System.out.println(fan2.toString());
    }
}
