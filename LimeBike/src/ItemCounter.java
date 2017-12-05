import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by Shivani Shinde on 01-12-2017.
 */

// Item Counter class
public class ItemCounter {

    HashMap<Integer, String> startMap = new HashMap<>();
    HashMap<Integer, String> endMap = new HashMap<>();
    HashMap<Integer, List<String>> itemList = new HashMap<>();
    PriorityQueue<String> timeSorted = new PriorityQueue<>();
    ArrayList<ArrayList<String>> intervalList = new ArrayList<>();
    int i=1;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    String ST;
    String ET;

    // Actual function to process the ride object information
    private void processRide(Ride ride){
        // Formatting the start time according to the requirement
        ST = ride.startTime.format(formatter);
        ET = ride.endTime.format(formatter);

        // To keep the start time always lesser than end time
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add(ST);
        queue.add(ET);
        ST = queue.poll();
        ET = queue.poll();

        System.out.println(ST+"  "+ET);

        // Sorted time
        timeSorted.add(ST);
        timeSorted.add(ET);

        // Start time, end time and item list
        startMap.put(i, ST);
        endMap.put(i, ET);
        itemList.put(i, ride.items);
        i++;
    }

    // Dummy function with static data from the given example in the question
    private void process_Ride(){
        timeSorted.add("07:00");
        timeSorted.add("07:30");
        startMap.put(1, "07:00");
        endMap.put(1, "07:30");
        itemList.put(1, Arrays.asList("2 apples", "1 brownies"));

        timeSorted.add("07:10");
        timeSorted.add("08:00");
        startMap.put(2, "07:10");
        endMap.put(2, "08:00");
        itemList.put(2, Arrays.asList("1 apples", "3 carrots"));

        timeSorted.add("07:20");
        timeSorted.add("07:45");
        startMap.put(3, "07:20");
        endMap.put(3, "07:45");
        itemList.put(3, Arrays.asList("1 apples", "2 brownies", "4 diamonds"));
    }

    // Function to create intervals
    private void CreateIntervals(){
        String firstElm = timeSorted.poll();
        while(!timeSorted.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(firstElm);
            firstElm = timeSorted.poll();
            list.add(firstElm);
            intervalList.add(list);
        }
    }

    // Function to print the items in every interval
    private void printItemsPerInterval(){

        // Iterate over the interval list
        for(int j=0;j<intervalList.size();j++){
            ArrayList<String> list = intervalList.get(j);
            System.out.print(list+" --> ");

            // For items to be in sorted order, in case entered randomly
            TreeMap<String,Integer> transitItems = new TreeMap<>();
            ST = list.get(0);
            ET = list.get(1);

            // Iterate to find the items within the interval
            for(Integer in : startMap.keySet()){
                int result1 = ST.compareTo(startMap.get(in));
                int result2 = ET.compareTo(endMap.get(in));

                // Compare start and end time
                if((result1 > 0 || result1 == 0) && (result2 < 0 || result2 == 0)) {
                    List<String> items = itemList.get(in);
                    for (int k = 0; k < items.size(); k++) {
                        String[] itemArray = items.get(k).split(" ");
                        int count = Integer.parseInt(itemArray[0]);
                        String name = itemArray[1];
                        if (transitItems.containsKey(name)) {
                            transitItems.put(name, transitItems.get(name) + count);
                        } else {
                            transitItems.put(name, count);
                        }
                    }
                }
            }

            // Printing the list of items for the specific interval
            ArrayList<String> printItems = new ArrayList<>();
            for (String name: transitItems.keySet()){
                String mergedS = transitItems.get(name) + " " + name;
                printItems.add(mergedS);
            }
            if(printItems.size() == 0){
                System.out.println("[ No items in this interval ]");
            }
            else{
                System.out.println(printItems);
            }
        }
    }
    public static void main(String[] args){
        ItemCounter itemCounter = new ItemCounter();
        // Creating Ride class objects and passing it to the actual processing function
        /*
        Random random = new Random();
        LocalTime timeS;
        LocalTime timeE;
        timeS = LocalTime.MIN.plusSeconds(random.nextLong());
        timeE = LocalTime.MIN.plusSeconds(random.nextLong());
        Ride ride1 = new Ride(timeS, timeE, Arrays.asList("1 apple", "1 diamond", "2 carrots"));
        itemCounter.processRide(ride1);   // Actual Function execution
        timeS = LocalTime.MIN.plusSeconds(random.nextLong());
        timeE = LocalTime.MIN.plusSeconds(random.nextLong());
        Ride ride2 = new Ride(timeS, timeE, Arrays.asList("2 apple", "1 brownie", "1 carrots"));
        itemCounter.processRide(ride2);   // Actual Function execution
        */
        itemCounter.process_Ride();  // Dummy function Execution
        itemCounter.CreateIntervals();
        itemCounter.printItemsPerInterval();
    }
}
