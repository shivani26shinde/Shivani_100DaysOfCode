import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Shivani Shinde on 01-12-2017.
 */
public class ItemCounter {
    public static HashMap<Integer, String> startMap = new HashMap<>();
    public static HashMap<Integer, String> endMap = new HashMap<>();
    public static HashMap<Integer, List<String>> itemList = new HashMap<>();
    static int i=1;
    public static LocalTime timeS;
    public static LocalTime timeE;
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    public static  void processRide(Ride ride){
        String ST = ride.startTime.format(formatter);
        String ET = ride.endTime.format(formatter);
        startMap.put(i, ST);
        endMap.put(i, ET);
        itemList.put(i, ride.items);
        System.out.println(startMap.get(i)+"   "+endMap.get(i)+"   "+itemList.get(i));
        i++;
    }
    public static void printItemsPerInterval(){

    }
    public static void main(String[] args){
        //String endTime = timeE.format(formatter);
        Random random = new Random();
        timeS = LocalTime.MIN.plusSeconds(random.nextLong());
        timeE = LocalTime.MIN.plusSeconds(random.nextLong());
        Ride ride1 = new Ride(timeS, timeE, Arrays.asList("1apple", "1diamond", "2carrots"));
        processRide(ride1);
        timeS = LocalTime.MIN.plusSeconds(random.nextLong());
        timeE = LocalTime.MIN.plusSeconds(random.nextLong());
        Ride ride2 = new Ride(timeS, timeE, Arrays.asList("2apple", "1brownie", "1carrots"));
        processRide(ride2);
    }
}
