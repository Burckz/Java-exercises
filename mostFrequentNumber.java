import java.util.*;

public class mostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("\\ ")));


        Hashtable<String, Integer> keys = new Hashtable<String, Integer>();


        for (String number:input
             ) {
            if(!keys.containsKey(number)){
                keys.put(number, 1);

            }
            else {
                int prevVal = keys.get(number);
                int currentVal = prevVal + 1;
                keys.put(number, currentVal);

            }
        }


        Integer bestVal = 0;
        String key = "";
        for (Map.Entry<String, Integer> entry : keys.entrySet()
             ) {
            Integer value = entry.getValue();

            if(bestVal <= value) {
                bestVal = value;
                key = entry.getKey();
            }
        }
        System.out.println(key);

    }
}
