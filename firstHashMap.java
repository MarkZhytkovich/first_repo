import java.util.HashMap;
import java.util.Map;

public class firstHashMap {
    public static void main(String [] args) {
        Map<Integer, String> testHashMap = new HashMap<Integer, String>();
        testHashMap.put(24, "Саша");
        testHashMap.put(21, "Маша");
        testHashMap.put(22, "Лена");
        System.out.println(testHashMap.values());
        System.out.println(testHashMap.keySet());

        for (Map.Entry<Integer, String> entry: testHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

}