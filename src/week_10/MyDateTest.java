package assignments.week_10;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println("Date 1: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date 2: " + date2.getDay() +"/"+ date2.getMonth() + "/" + date2.getYear());
    }
}
