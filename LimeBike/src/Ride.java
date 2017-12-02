import java.time.LocalTime;
import java.util.List;

/**
 * Created by Shivani Shinde on 01-12-2017.
 */
public class Ride {
    LocalTime startTime;
    LocalTime endTime;
    List<String> items;
    public Ride(LocalTime startTime, LocalTime endTime, List<String> items){
        this.startTime = startTime;
        this.endTime = endTime;
        this.items = items;
    }
}
