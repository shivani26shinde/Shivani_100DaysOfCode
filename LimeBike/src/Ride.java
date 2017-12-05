import java.time.LocalTime;
import java.util.List;

/**
 * Created by Shivani Shinde on 01-12-2017.
 */

// Ride class
public class Ride {

    LocalTime startTime;
    LocalTime endTime;
    List<String> items;

    // Ride class constructor
    public Ride(LocalTime startTime, LocalTime endTime, List<String> items){
        this.startTime = startTime;
        this.endTime = endTime;
        this.items = items;
    }
}
