package assignments.week_09;
import java.util.Date;
public class StopWatch {
    long startTime;
    long endTime;



    public StopWatch () {
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start (){
        startTime = System.currentTimeMillis();
    }
    public void stop (){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
